import java.util.ArrayList;


public class Main{
	// TEST
	// --interface homme-machine--
	public static void main(String[] args){
		// creation de donnee
		Donnee d1 = new Donnee(1, 25, "donnee1");
		Donnee d2 = new Donnee(2, 25, "donnee2");
		Donnee d3 = new Donnee(3, 50, "donnee3");
		Donnee d4 = new Donnee(4, 30, "donnee4");
		Donnee d5 = new Donnee(5, 45, "donnee5");
		// creation des noeuds
		NoeudSysteme nd1 = new NoeudSysteme(1, 50);
		NoeudSysteme nd2 = new NoeudSysteme(2, 40);
		NoeudSysteme nd3 = new NoeudSysteme(3, 40);
		NoeudSysteme nd4 = new NoeudSysteme(4, 50);
		NoeudSysteme nd5 = new NoeudSysteme(5, 40);
		// noeud utilisateur
		Utilisateur util1 = new Utilisateur(31);
		Utilisateur util2 = new Utilisateur(32);
		Utilisateur util3 = new Utilisateur(33);
		// remplissqge des noeuds
		nd1.setAcces(31);
		for(int k = 2; k<5; k++){
			nd1.setAcces(k);
		}
		//**************************************************************************
		nd2.setAcces(1);
		nd2.setAcces(4);
		nd2.setAcces(3);
		nd2.setAcces(5);
		//**************************************************************************
		nd3.setAcces(1);
		nd3.setAcces(2);
		nd3.setAcces(4);
		nd3.setAcces(5);
		//**************************************************************************
		nd4.setAcces(32);
		nd4.setAcces(1);
		nd4.setAcces(2);
		nd4.setAcces(3);
		nd4.setAcces(5);
		//**************************************************************************
		nd5.setAcces(33);
		nd5.setAcces(1);
		nd5.setAcces(2);
		nd5.setAcces(3);
		nd5.setAcces(4);
		//**************************************************************************
		util1.set_noeud_directement_accessible(1);
		util2.set_noeud_directement_accessible(5);
		util3.set_noeud_directement_accessible(4);
		//**************************************************************************
		util1.add_donnee_interet(d1);
		util1.add_donnee_interet(d2);
		util2.add_donnee_interet(d3);
		util2.add_donnee_interet(d5);
		util3.add_donnee_interet(d2);
		util3.add_donnee_interet(d4);
		//**************************************************************************
		d1.set_utilisateur_interesse(util1);
		d2.set_utilisateur_interesse(util1);
		d2.set_utilisateur_interesse(util3);
		d3.set_utilisateur_interesse(util2);
		d5.set_utilisateur_interesse(util2);
		d4.set_utilisateur_interesse(util3);
		//**************************************************************************
		ArrayList<NoeudSysteme> liste_noeud_systeme = new ArrayList<NoeudSysteme>(){{
			add(nd1);
			add(nd2);
			add(nd3);
			add(nd4);
			add(nd5);
		}};
		util1.set_liste_noeud_systeme(liste_noeud_systeme);
		util2.set_liste_noeud_systeme(liste_noeud_systeme);
		util3.set_liste_noeud_systeme(liste_noeud_systeme);
		//**************************************************************************
		ArrayList<Integer> liste_noeud = new ArrayList<Integer>(){{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(31);
			add(32);
			add(33);
		}};
		//**************************************************************************
		Arc arc1 = new Arc(31, 1, 2);
		Arc arc2 = new Arc(2, 1,1);
		Arc arc3 = new Arc(3, 1, 1);
		Arc arc4 = new Arc(4, 1,3);
		Arc arc5 = new Arc(5, 1,3);
		Arc arc6 = new Arc(3, 2, 3);
		Arc arc7 = new Arc(3, 4, 3);
		Arc arc8 = new Arc(3, 5, 1);
		Arc arc9 = new Arc(32, 5, 2);
		Arc arc10 = new Arc(33, 4, 2);
		Arc arc11 = new Arc(2, 5, 3);
		Arc arc12 = new Arc(4, 5, 1);
		Arc arc13 = new Arc(4, 2, 1);
		//**************************************************************************
		ArrayList<Arc> liste_arc = new ArrayList<Arc>(){{
			add(arc1);
			add(arc2);
			add(arc3);
			add(arc4);
			add(arc5);
			add(arc6);
			add(arc7);
			add(arc8);
			add(arc9);
			add(arc10);
			add(arc11);
			add(arc12);
			add(arc13);
		}};
		//**************************************************************************
		Tree arbre = new Tree(liste_noeud, liste_arc);
		System.out.println("--Everything is okay--");
	}
}
