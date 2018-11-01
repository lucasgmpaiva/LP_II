
public class BST {	
	
	private Node root;

	public BST() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public boolean search(int key) {
		return root.search(key);
	}

	public void insert(int key) {
		if(!search(key)) {
			if(root == null) {
				root = new Node(key);
			} else {
				root.insert(key);
			}
		} else {
			System.out.println("Valor já existente!");
		}
	}
}
