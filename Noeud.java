
import java.util.ArrayList;

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
}