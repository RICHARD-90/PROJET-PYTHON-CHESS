import java.util.*;

public class NoeudSysteme extends Noeud
  implements NoeudSystemeProprite{
  // attributs
  protected int capacite;
  protected ArrayList<Donnee> donnee_stocker = new ArrayList<Donnee>();
  protected ArrayList<Integer> noeud_accessible = new ArrayList<Integer>();

  // constructeur
  public NoeudSysteme(int id, int capacite){
    super(id);
    this.capacite = capacite;
  }

  // setters
  public void setCapacite(int capacite){
   this.capacite = capacite;
  }

  public void setAcces(int id_node){
    this.noeud_accessible.add(id_node);
   }

   // getters
   public ArrayList<Integer> getNoeudAccessible(){
      return this.noeud_accessible;
   }

   public int getCapacite(){
    return this.capacite;
   }

   public ArrayList<Donnee> getDonneeStocker(){
   	 	return this.donnee_stocker;
   }

   // fonctionnalités des noeuds systemes

  @Override
  public void stocker(Donnee data){
  /*
    permet de stocker une donnee dans un noeud
  */
   this.donnee_stocker.add(data);
  }

  @Override
  public ArrayList<Integer> noeud_accessible_sans_utilisateur(){
    /*
      * retourne la liste des noeuds accessibles sant les noeuds de type Utilisateur
    */
    ArrayList<Integer> copy = (ArrayList<Integer>) this.getNoeudAccessible().clone();
    for (int j = 0; j < copy.size(); j++){
      int id = copy.get(j);
      if (id>30){
        copy.remove(j);
      }
    }
    return copy;
  }

  @Override
  public boolean on_peut_stocker(Donnee donnee){
    /*
      * permet de savoir si l'on peut y stocker une donnee ou non
    */
   int donnee_taille = donnee.getTaille();
   if (donnee_taille <= this.getCapacite()){
     return true;
   }
   else
     return false;
  }

}
