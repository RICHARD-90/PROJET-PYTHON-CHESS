
public class Arc{
	
	private Noeud node1, node2;
	private int ponderation;

	// constructeur
	Arc(Noeud nod1, Noeud nod2, int pond){
		this.node1 = nod1;
		this.node2 = nod2;
		this.ponderation = pond;
	}

	// getters 
	public Noeud getNode1(){
		return this.node1;
	}

	public Noeud getNode2(){
		return this.node2;
	}

	public int getPond(){
		return this.ponderation;
	}
}