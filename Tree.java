import java.util.ArrayList;

public class Tree{
	/*
	On choisit une representation ensembliste des donnees:
		E : liste des noeuds systemes
		V : liste des arcs et des ponderations
	*/
	private ArrayList<Noeud> nodes;
	private ArrayList<Arc> arcs;

	Tree(ArrayList<Noeud> E, ArrayList<Arc> V){
		this.nodes = E;
		this.arcs = V;
	}

	// getters

	public ArrayList<Noeud> get_nodes(){
		return this.nodes;
	}

	public ArrayList<Arc> get_arcs(){
		return this.arcs;
	}
	
	
}

