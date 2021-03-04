
import java.util.*;

public class Noeud{

	// les attributs
	protected int Id_noeud, capacite;
	protected ArrayList<Donnee> donneeStocker = new ArrayList<Donnee>();
	protected ArrayList<Noeud> noeudAccessible = new ArrayList<Noeud>();

	//constructeur
	public Noeud(int id_noeud, int capacite){
	 	this.Id_noeud = id_noeud;
	 	this.capacite = capacite;
	 }

	 // setters
	 public void setId(int id){
	 	this.Id_noeud = id;
	 }

	 public void setCapacite(int capacite){
	 	this.capacite = capacite;
	 }

	 public void addDonnee(Donnee data){
	 	this.donneeStocker.add(data);
	 }

	public void setAcces(Noeud node){
	 	this.noeudAccessible.add(node);
	 }

	 // getters
	 public int getId(){
	 	return this.Id_noeud;
	 }

	 public int getCapacite(){
	 	return this.capacite;
	 }

	 public ArrayList<Donnee> getDonneeStocker(){
	 	return this.donneeStocker;
	 }

	 public ArrayList<Noeud> getNoeudAccessible(){
	 	return this.noeudAccessible;
	 }

	 public boolean on_peut_stocker(Donnee donnee){
	 	int donnee_taille = donnee.getTaille();
	 	if (donnee_taille <= this.capacite){
	 		return true;
	 	}
	 	else
	 		return false;
	 }

	 public ArrayList<Noeud> est_en_relation_avec(Tree p_tree){
		 return p_tree.est_en_relation_avec(this);
	 }

	 public boolean equal(Noeud p_node){
		 if (this.getId() == p_node.getId()){
			 return true;
		 }
		 else{
			 return false;
		 }
	 }

	//  public ArrayList<Noeud> noeud_accessible_trie(Tree p_tree, ArrayList<Noeud> liste){
 	// 	/*
 	// 	retourne la liste des noeuds accessibles classée des plus proche au plus eloignées.
 	// 	*/
 	// 	//ArrayList<Noeud> liste = new ArrayList<Noeud>;
	// 	ArrayList<Noeud> voisin = this.est_en_relation_avec(p_tree);
 	// 	if (voisin.size() == 0 || liste.size() == this.getNoeudAccessible().size()){
	// 		return liste;
	// 	}
	// 	else{
	// 		liste.addAll(voisin);
	// 		for (int i = 0; i < voisin.size(); i++){
	// 			voisin.get(i).noeud_accessible_trie(p_tree, liste);
	// 		}
	//
	// 	}
	// 	return liste;
 	// }
}
