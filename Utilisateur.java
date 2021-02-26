
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
}
