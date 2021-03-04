
import java.util.ArrayList;

class Utilisateur extends Noeud{
	// les attributs
	private String nom, prenom;

	Utilisateur(int id, int cap){
		super(id, cap);
	}

	// setters
	public void setNom(String nom){
		this.nom = nom;
	}

	public void setPrenom(String prenom){
		this.prenom = prenom;
	}

	// getters
	public String getNom(){
		return this.nom;
	}

	public String getPrenom(){
		return this.prenom;
	}

	public String stockage_data(Tree p_tree){
		ArrayList<Donnee> liste_donnee = this.getDonneeStocker();
		ArrayList<Noeud> noeud_accessible = this.getNoeudAccessible();
		/*
		sachant que l'utilisateur a acces a tous les noeuds du reseau il est
		interressant de se focaliser sur les noeuds proches de lui
		*/
		for (int i = 0; i < liste_donnee.size(); i++){
			int compteur = 0;
			// on recupère la donnee que l'on met dans une variable
			Donnee donnee = liste_donnee.get(i);
			/* on parcours la liste des noeuds accessible afin de trouver un
			emplacement pour cette donnee*/
			for (int k = 0; k < noeud_accessible.size(); k++){
				Noeud noeud_actuel = noeud_accessible.get(k);
				if (noeud_actuel.on_peut_stocker(donnee) && compteur == 0){
					// on stock puis on modifie la capacité du noeud
					noeud_actuel.addDonnee(donnee);
					compteur ++;
					noeud_actuel.setCapacite(noeud_actuel.getCapacite() - donnee.getTaille());
				}
				else
					continue;
			}
		}
		return "--stockage effectué avec succes--";
	}

// 	public ArrayList<Noeud> noeud_accessible_trie(Tree p_tree){
// 		/*
// 		retourne la liste des noeuds accessibles classée des plus proche au plus eloignées.
// 		*/
// 		ArrayList<Noeud> liste = new ArrayList<Noeud>();
// 		return this.noeud_accessible_trie(p_tree, liste);
// 	}
}
