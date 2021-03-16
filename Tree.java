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

}
