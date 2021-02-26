
import java.util.ArrayList;

public class Donnee{
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