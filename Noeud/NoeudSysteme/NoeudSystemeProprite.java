package Noeud.NoeudSysteme;

import java.util.ArrayList;


public interface NoeudSystemeProprite{

  public void stocker(Donnee data);

  ArrayList<Integer> noeud_accessible_sans_utilisateur();

  boolean on_peut_stocker(Donnee donnee);

}
