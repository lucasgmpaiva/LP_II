
public class Node {
	
	private int key;
	private Node father;
	private Node left_son;
	private Node right_son;
	
	public Node () {
		this.father = null;
		this.left_son = null;
		this.right_son = null;
	}
	
	public Node(int key) {
		this();
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public Node getLeft_son() {
		return left_son;
	}

	public void setLeft_son(Node left_son) {
		this.left_son = left_son;
	}

	public Node getRight_son() {
		return right_son;
	}

	public void setRight_son(Node right_son) {
		this.right_son = right_son;
	}
	
	public boolean search(int key) {
		boolean ret = false;
		if (this.key == key) ret = true;
		if (this.key < key) ret = left_son.search(key);
		if (this.key > key) ret = right_son.search(key);			
		return ret;
	}

	public void insert(int key) {

	}
	
}
