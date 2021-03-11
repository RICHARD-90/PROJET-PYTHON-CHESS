
public class Arc{

	private int node1, node2;
	private int ponderation;

	// constructeur
	Arc(int nod1, int nod2, int pond){
		this.node1 = nod1;
		this.node2 = nod2;
		this.ponderation = pond;
	}

	public int getNode1() {
		return node1;
	}

	public void setNode1(int node1) {
		this.node1 = node1;
	}

	public int getNode2() {
		return node2;
	}

	public void setNode2(int node2) {
		this.node2 = node2;
	}

	public int getPonderation() {
		return ponderation;
	}

	public void setPonderation(int ponderation) {
		this.ponderation = ponderation;
	}

}
