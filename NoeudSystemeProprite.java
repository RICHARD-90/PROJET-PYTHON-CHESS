import java.util.ArrayList;

public interface NoeudSystemeProprite{


  ArrayList<Integer> noeud_accessible_sans_utilisateur();

  boolean on_peut_stocker(Donnee donnee);

}
