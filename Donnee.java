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

}
