
import java.util.*;

public class Noeud{

	// les attributs
	protected int Id_noeud;

	//constructeur
	public Noeud(int id_noeud){
		super();
	 	this.Id_noeud = id_noeud;
	 }
	 // setters
	 public void setId(int id){
	 	this.Id_noeud = id;
	 }
	  // getters
	 public int getId(){
	 	return this.Id_noeud;
	 }

// ****************************************************************************
	 public boolean equal(Noeud p_node){
		 /*
		 	permet de savoir si deux objets de type Noeud ont le meme identifiant
		 */
		 if (this.getId() == p_node.getId()){
			 return true;
		 }
		 else{
			 return false;
		 }
	 }

}
