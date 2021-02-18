
import java.util.ArrayList;

// dataStructure
class Main{
	public static void main(String[] args){
		// main fonction
		//System.out.println("everything is okay");
	}
}

class Donnee{
	// les attributs
	int Id, taille;
	String nom;

	//constructeur
	Donnee(int Id, int taille, String nom){
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

}

class Noeud{

	// les attributs
	int Id_noeud, capacite;
	 ArrayList<Donnee> donneeStocker; 
	 ArrayList<Noeud> noeudAccessible;

	 //constructeur
	 Noeud(int id_noeud, int capacite,  ArrayList<Donnee> donneeStocker,  ArrayList<Noeud> noeudAccessible){
	 	this.Id_noeud = id_noeud;
	 	this.capacite = capacite;
	 	this.donneeStocker = donneeStocker;
	 	this.noeudAccessible = noeudAccessible;
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
}

class Utilisateur{

	// les attributs
	int Id;
	 ArrayList<Donnee> listDonneeID;
	 ArrayList<Noeud> listNoeudAccessible;

	// constructeur
	Utilisateur(int Id,  ArrayList<Donnee> listDonneeID,  ArrayList<Noeud> listNoeudAccessible){
		this.Id = Id;
		this.listDonneeID = listDonneeID;
		this.listNoeudAccessible = listNoeudAccessible;
	}
	// setters
	public void setId(int Id){
		this.Id = Id;
	}
	public void addData(Donnee data){
		this.listDonneeID.add(data);
	}
	public void setNoeudAccessible(Noeud node){
		this.listNoeudAccessible.add(node);
	}

	// getters 
	public int getId(){
		return this.Id;
	}
	public  ArrayList<Donnee> getListDonneeID(){
		return this.listDonneeID;
	}
	public  ArrayList<Noeud> getListNoeudAccessible(){
		return this.listNoeudAccessible;
	}

}