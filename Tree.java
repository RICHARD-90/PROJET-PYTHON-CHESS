import java.util.ArrayList;
import java.util.Collections;

public class Tree{
	/*
	On choisit une representation ensembliste des donnees:
		E : liste des noeuds systemes
		V : liste des arcs et des ponderations
	*/
	private ArrayList<Integer> nodes = new ArrayList<Integer>();
	private ArrayList<Arc> arcs = new ArrayList<Arc>();

	// constructeur
	public Tree(ArrayList<Integer> nodes, ArrayList<Arc> arcs) {
		super();
		this.nodes = nodes;
		this.arcs = arcs;
	}

	// setters
	public void setNodes(int nodes) {
		this.nodes.add(nodes);
	}

	public void setArcs(ArrayList<Arc> arcs) {
		this.arcs = arcs;
	}

	public void add_nodes(int p_node){
		this.nodes.add(p_node);
	}

	public void add_arcs(Arc p_arc){
		this.arcs.add(p_arc);
	}

	// getters
	public ArrayList<Arc> getArcs() {
		return arcs;
	}

	public ArrayList<Integer> getNodes() {
		return nodes;
	}

	// fonctionnalités avancées du graphe
	public int ponderation(int id1, int id2){
		/*
		retourne la ponderation de l'arc contenant les deux noeuds entres en parametre
		*/
		int pond = 0;
		for (Arc arc : this.getArcs()){
			if ((arc.getNode1() == id1 || arc.getNode2() == id1) && (arc.getNode1() == id2 || arc.getNode2() == id2)){
				pond = arc.getPonderation();
			}
		}
		return pond;
	}

	public ArrayList<Integer> sorted_liste(ArrayList<Integer> liste, int id){
		/*
		retourne une liste rangee par ponderation croissante
		*/
		ArrayList<Integer> resultat = new ArrayList<Integer>(){{add(0);}};
		int min_pond = 5;// seuil qui est tel que le premiere noeud sera toujours ajoute dans la liste
		int indice = 0;
		for (int v_id : liste){
			indice++;
			int pond = this.ponderation(id, v_id);
			if (pond < min_pond){
				min_pond = pond;
				resultat.add(v_id);
				Collections.swap(resultat, indice-1 , indice);
			}
			else{
				min_pond = pond;
				resultat.add(v_id);
			}
		}
		return resultat;
	}

	public ArrayList<Integer> simili_dijkstra(int id_noeud, Utilisateur utilisateur){
		/*
			Cette pour but de proposer le plus court chemin entre deux noeuds entrés
			en parametre.
		*/

		int id = 0;
		boolean find = true;
		int entier = 0;
		ArrayList<Integer> liste = new ArrayList<Integer>();
		ArrayList<Arc> liste_arc = this.getArcs();
		liste.add(id_noeud);

		while (find){
			int min_pond = 6;

			if (utilisateur.get_noeud_directemen_accessible() == id_noeud){
				liste.add(utilisateur.getId());
			find = false;
			}

			else{
				ArrayList<Integer> new_liste_arc_indice = new ArrayList<Integer>();

				for (int a = 0; a < liste_arc.size(); a++){
					Arc arc = liste_arc.get(a);
					if (id_noeud == arc.getNode1() || id_noeud == arc.getNode2() ){
						new_liste_arc_indice.add(a);}
				}

				for (int indice : new_liste_arc_indice){
					Arc v_arc = liste_arc.get(indice);
					if (v_arc.getPonderation() < min_pond){
						min_pond = v_arc.getPonderation();
						if (id_noeud == v_arc.getNode1() ){
							id = v_arc.getNode2();}
						if (id_noeud == v_arc.getNode2() ){
							id = v_arc.getNode1();}
					}
				}

				int a = -1;
				for (int ind : new_liste_arc_indice){
					a++;
					liste_arc.remove(ind - a);}

				liste.add(id);
			}

		 entier++;
		 id_noeud = id;
		}
		return liste;
		}

}
