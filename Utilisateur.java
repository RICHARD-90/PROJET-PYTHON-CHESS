
import java.util.ArrayList;

class Utilisateur extends Noeud
	implements UtilisateurPropriete{
	// les attributs
	protected ArrayList<Donnee> donnee_interet = new ArrayList<Donnee>();
	protected int noeud_directement_accessible;

	protected ArrayList<NoeudSysteme> liste_noeud_systeme;

	Utilisateur(int id){
		super(id);
	}

	public void set_noeud_directement_accessible(int id_noeud){
		this.noeud_directement_accessible = id_noeud;
	}

	public int get_noeud_directemen_accessible(){
		return this.noeud_directement_accessible;
	}

	public ArrayList<Donnee> getDonnee_interet() {
		return donnee_interet;
	}

	public void add_donnee_interet(Donnee p_donnee_interet) {
		this.donnee_interet.add(p_donnee_interet);
	}

	public void set_liste_noeud_systeme(ArrayList<NoeudSysteme> liste){
		this.liste_noeud_systeme = liste;
	}

	public ArrayList<NoeudSysteme> get_liste_noeud_systeme(){
		return this.liste_noeud_systeme;
	}

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
	public void stockage_donnee(Tree p_tree){
		/*
			propose un stockage efficace des donnees de l'utilisateur
		*/
		for (Donnee data : this.getDonnee_interet()){
			int compteur = 0;
			NoeudSysteme noeud_proche = this.noeud_info(this.get_noeud_directemen_accessible());
			if (noeud_proche.on_peut_stocker(data) && compteur == 0){
				data.stocker_dans(noeud_proche);
				compteur++;
			}
			else{
				ArrayList<Integer> voisin_noeud_proche = noeud_proche.noeud_accessible_sans_utilisateur();
				ArrayList<Integer> sorted_list = p_tree.sorted_liste(voisin_noeud_proche, this.get_noeud_directemen_accessible());
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
	}


}
