
public class Arc{

	private Noeud node1, node2;
	private int ponderation;

	// constructeur
	Arc(Noeud nod1, Noeud nod2, int pond){
		this.node1 = nod1;
		this.node2 = nod2;
		this.ponderation = pond;
	}

	public Noeud getNode1() {
		return node1;
	}

	public void setNode1(Noeud node1) {
		this.node1 = node1;
	}

	public Noeud getNode2() {
		return node2;
	}

	public void setNode2(Noeud node2) {
		this.node2 = node2;
	}

	public int getPonderation() {
		return ponderation;
	}

	public void setPonderation(int ponderation) {
		this.ponderation = ponderation;
	}
}
