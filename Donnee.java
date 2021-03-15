import java.util.*;

public class Donnee{
	// les attributs
	private int Id, taille;
	private String nom;
	private ArrayList<Utilisateur> utilisateur_interesse = new ArrayList<Utilisateur>();

	//constructeur
	public Donnee(int Id, int taille, String nom){
		this.Id = Id;
		this.taille = taille;
		this.nom = nom;
	}

	// setters
	public void setId(int Id){
		this.Id = Id;
	}
	public void setTaille(int taille){
		this.taille = taille;
	}
	public void setNom(String nom){
		this.nom = nom;
	}

	public void set_utilisateur_interesse(Utilisateur p_util){
		this.utilisateur_interesse.add(p_util);
	}

	// getters
	public int getId(){
		return this.Id;
	}
	public int getTaille(){
		return this.taille;
	}
	public String getNom(){
		return this.nom;
	}

	public ArrayList<Utilisateur> get_utilisateur_interesse(){
		/*
			retourne la liste de tous les utilisateurs interessés par cette donnée
		*/
		return this.utilisateur_interesse;
	}

	// Operations propres aux données
	public void stocker_dans(NoeudSysteme p_node){
		/*
			la donnee est sauvergarder dans le noeud
		*/
		p_node.stocker(this);
		p_node.setCapacite(p_node.getCapacite() - this.getTaille());
	}

	public ArrayList<Integer> elle_est_stockee(ArrayList<NoeudSysteme> liste_noeud){
		int capteur = 0;
		int id = 0;
		for(NoeudSysteme noeud : liste_noeud){
			ArrayList<Donnee> liste_donnee_noeud = noeud.getDonneeStocker();
			for (int k = 0; k < liste_donnee_noeud.size(); k++){
				Donnee donnee =liste_donnee_noeud.get(k);
				if (this == donnee){
					capteur = 1;
					id = noeud.getId();
				}
			}
		}
		int a, b;
		a = capteur;
		b = id;
		ArrayList<Integer> reponse = new ArrayList<Integer>(){{
			add(a);
			add(b);
		}};
		return reponse;
	}

	public void destockage(NoeudSysteme nd){
		for(int g = 0; g < nd.getDonneeStocker().size(); g++){
			if (this == nd.getDonneeStocker().get(g)){
				nd.getDonneeStocker().remove(g);
				nd.setCapacite(nd.getCapacite() + this.getTaille());
			}
		}
	}

	public void stockage_efficace(ArrayList<Integer> liste, Utilisateur util){
		int compteur = 0;
		for (int k = 0; k<25; k++){
			for (int id_noeud : liste){
				NoeudSysteme current_node = util.noeud_info(id_noeud);
				if ((this.getTaille() >= current_node.getCapacite() - k) && (this.getTaille() <= current_node.getCapacite()) && (compteur == 0)){
					this.stocker_dans(current_node);
					compteur++;
					continue;
				}
			}
		}
	}

}
