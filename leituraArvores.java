	private String readTreeInLevel(Node no) {
		String t = "";
		if (no == null) t = "";
		else {
			Deque <Node> fila = new ArrayDeque<>();
			fila.add(no);
			while(!fila.isEmpty()) {
				Node current =  fila.removeFirst();
				t += " " + current.getKey();
				if(current.getLeft() != null) fila.add(current.getLeft());
				if(current.getRight() != null) fila.add(current.getRight());
			}
		}
		return t;
	}
	
	
	//unused
	private String readTreePreOrder(Node no) {
		if(no == null) return "";
		String t = "";
		t += (t.isEmpty() ? " " : " ,") + no.toString();
		t += readTreePreOrder(no.getLeft());
		t += readTreePreOrder(no.getRight());
		return t;
	}
	
	//unused
	private String readTreeInOrder(Node no) {
		if (no == null) { return ""; }
		String t = "";
		if(no.getLeft() != null) {
			t += (t.isEmpty() ? "" : ",") + readTreeInOrder(no.getLeft());
		}
		t += (t.isEmpty() ? "" : ",") + no.toString();
		if (no.getRight() != null) {
			t+= (t.isEmpty() ? "" : ",") + readTreeInOrder(no.getRight());
		}
		return t;
	}