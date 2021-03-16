
import java.util.ArrayList;

class Utilisateur extends Noeud
	implements UtilisateurPropriete{
	// les attributs
	protected ArrayList<Donnee> donnee_interet = new ArrayList<Donnee>();
	protected int noeud_directement_accessible;
	protected ArrayList<NoeudSysteme> liste_noeud_systeme;

	// constructeur
	Utilisateur(int id){
		super(id);
	}

	// setters
	public void set_noeud_directement_accessible(int id_noeud){
		this.noeud_directement_accessible = id_noeud;
	}

	public void add_donnee_interet(Donnee p_donnee_interet) {
		this.donnee_interet.add(p_donnee_interet);
	}

	public void set_liste_noeud_systeme(ArrayList<NoeudSysteme> liste){
		this.liste_noeud_systeme = liste;
	}

	// getters
	public int get_noeud_directemen_accessible(){
		return this.noeud_directement_accessible;
	}

	public ArrayList<Donnee> getDonnee_interet() {
		return donnee_interet;
	}

	public ArrayList<NoeudSysteme> get_liste_noeud_systeme(){
		return this.liste_noeud_systeme;
	}

// fontions realisables par un utilisateur
	@Override
	public NoeudSysteme noeud_info(int id){
		/*
			prend en paramettre l'identifiant d'un noeud systeme puis retourne son
			l'objet NoeudSysteme associé
		*/
		NoeudSysteme node = new NoeudSysteme(1,1);
		for (NoeudSysteme v_noeud : this.get_liste_noeud_systeme()){
			if (v_noeud.getId() == id) node =  v_noeud;
		}
		return node;
	}

	@Override
	public void stockage_simple(Tree tree, Donnee data){
		/*
			permet de stocker des donnees qui n'ont pas encore ete stocker
		*/
		int compteur = 0;
		NoeudSysteme noeud_proche = this.noeud_info(this.get_noeud_directemen_accessible());
		if (noeud_proche.on_peut_stocker(data) && compteur == 0){
			data.stocker_dans(noeud_proche);
			compteur++;
		}

		else{
			ArrayList<Integer> voisin_noeud_proche = noeud_proche.noeud_accessible_sans_utilisateur();
			ArrayList<Integer> sorted_list = tree.sorted_liste(voisin_noeud_proche, this.get_noeud_directemen_accessible());

			for (int id_noeud : sorted_list){
				NoeudSysteme noeud = this.noeud_info(id_noeud);
				if (noeud.on_peut_stocker(data) && compteur == 0){
					data.stocker_dans(noeud);
					compteur++;
				}
				else continue;
			}
		}
	}

	@Override
	public void restockage_donnee(Tree tree, Donnee data, NoeudSysteme noeud){
		/*
			Permet le restockage de donnee deja stocker par un autre utilisateur
		*/
		if (noeud.getId() == this.get_noeud_directemen_accessible()){
			//on ne fait
			}

		else{
			ArrayList<Integer> chemin;
			chemin = tree.simili_dijkstra(noeud.getId(), this);
			int milieu = (int) chemin.size()/2;
			int compteur = 0;

			for (int t = milieu-1; t < milieu+1 ; t++){
				NoeudSysteme n = this.noeud_info(chemin.get(t));
				if ((n.on_peut_stocker(data)) && (compteur == 0)){
					data.stocker_dans(n);
					compteur++;}
			}
		}
		data.destockage(noeud);
	}

	@Override
	public void stockage_avancee1(Tree tree){
		/*
			permet un stockage optimal des donnees
		*/
		for (Donnee data : this.getDonnee_interet()){
			if (data.elle_est_stockee(this.get_liste_noeud_systeme()).get(0) == 1){
				int ind = data.elle_est_stockee(this.get_liste_noeud_systeme()).get(1);
				NoeudSysteme v_noeud = this.noeud_info(ind);
				this.restockage_donnee(tree, data, v_noeud);
			}

			else{
				this.stockage_simple(tree, data);
				}
		}
	}

}
