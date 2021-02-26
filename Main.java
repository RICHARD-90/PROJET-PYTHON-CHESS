import java.util.ArrayList;

public class Main{
	// --interface homme-machine--
	public static void main(String[] args){
		// creation de donnee
		Donnee d1 = new Donnee(1, 25, "donnee1");
		Donnee d2 = new Donnee(2, 25, "donnee2");
		Donnee d3 = new Donnee(3, 50, "donnee3");
		// creation des noeuds
		// noeud 1 
		Noeud nd1 = new Noeud(1, 50);
		// noeud 2
		Noeud nd2 = new Noeud(2, 40);
		// noeud 2
		Noeud nd3 = new Noeud(3, 40);
		// noeud utilisateur
		Utilisateur util = new Utilisateur(1, 100);
		// remplissqge des noeuds
		nd1.setAcces(util);
		nd1.setAcces(nd2);
		nd2.setAcces(nd1);
		nd2.setAcces(nd3);
		nd3.setAcces(nd2);
		util.setAcces(nd1);
		util.setAcces(nd2);
		util.setAcces(nd3);
		// add data
		util.addDonnee(d1);
		util.addDonnee(d2);
		util.addDonnee(d3);
		// creation des arcs
		Arc arc1 = new Arc(util, nd1, 2);
		Arc arc2 = new Arc(nd1, nd2, 1);
		Arc arc3 = new Arc(nd2, nd3, 1);
		// Tree
		ArrayList<Noeud> nodes = new ArrayList<Noeud>(){{
			add(util);
			add(nd1);
			add(nd2);
			add(nd3);
		}};
		ArrayList<Arc> arcs = new ArrayList<Arc>(){{
			add(arc1);
			add(arc2);
			add(arc3);
		}};
		Tree tree = new Tree(nodes, arcs);
		//********************************************************************
		//System.out.println(util.getNoeudAccessible());
		System.out.println("--Everything is okay--");
	}
}