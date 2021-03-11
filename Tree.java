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
	/**
	* Default Tree constructor
	*/
	public Tree(ArrayList<Integer> nodes, ArrayList<Arc> arcs) {
		super();
		this.nodes = nodes;
		this.arcs = arcs;
	}

	public ArrayList<Integer> getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes.add(nodes);
	}

	public ArrayList<Arc> getArcs() {
		return arcs;
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

}
/*
utiliser les interfaces
injection des donnees
organisation du code
les sources (mettre dans un dossier ressource_gestion de projet)
*/
