import java.util.ArrayList;

public class Tree{
	/*
	On choisit une representation ensembliste des donnees:
		E : liste des noeuds systemes
		V : liste des arcs et des ponderations
	*/
	private ArrayList<Noeud> nodes = new ArrayList<Noeud>();
	private ArrayList<Arc> arcs = new ArrayList<Arc>();
	/**
	* Default Tree constructor
	*/
	public Tree(ArrayList<Noeud> nodes, ArrayList<Arc> arcs) {
		super();
		this.nodes = nodes;
		this.arcs = arcs;
	}

	public ArrayList<Noeud> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Noeud> nodes) {
		this.nodes = nodes;
	}

	public ArrayList<Arc> getArcs() {
		return arcs;
	}

	public void setArcs(ArrayList<Arc> arcs) {
		this.arcs = arcs;
	}

	public void add_nodes(Noeud p_node){
		this.nodes.add(p_node);
	}

	public void add_nodes(Arc p_arc){
		this.arcs.add(p_arc);
	}
/*
* on prend un noeud en parametre puis on affiche tous les noeus en relations avec
* lui dans l'arbre
*/
public ArrayList<Noeud> est_en_relation_avec(Noeud p_noeud){
	ArrayList<Noeud> liste_node = new ArrayList<Noeud>();
	for (int f = 0; f < this.arcs.size(); f++){
		// arc courant
		Arc v_arc = this.arcs.get(f);
		Noeud node1 = v_arc.getNode1();
		Noeud node2 = v_arc.getNode2();
		if (p_noeud.equal(node1)){
			liste_node.add(node2);
		}
		else if (p_noeud.equal(node2)){
			liste_node.add(node1);
		}
	}
	return liste_node;
}

}
