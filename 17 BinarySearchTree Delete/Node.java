// Nicholas Romanoff
// Period One
// Homework #16 Binary Search Tree Part One
// 2014-04-27

public class Node {

	private int data;
	private Node left, right;

	public Node(int d) {
		data = d;
		left = null;
		right = null;
	}

    	public void setData(int d) {
		data = d;
    	}

    	public int getData() {
		return data;
  	  }

        public void setRight(Node n){
		right = n;
    	}
	public Node getRight() {
		return right;
    	}

    	public void setLeft(Node n){
		left = n;
   	}

    	public Node getLeft() {
		return left;
    	}

    	public String toString() {
		return ""+data;
    	}
}
