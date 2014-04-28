// Nicholas Romanoff
// Period One
// Homework #16 Binary Search Tree Part One
// 2014-04-27

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree(int n) {
		root = new Node(n);
	}

	public void insert(int n) {
		Node temp = root;
		while (temp != null) {
			Node next = temp;
			int nextData = next.getData();
			if (nextData > x) {
				temp = temp.getLeft();
				if (temp == null) {
					temp.setLeft(new Node(n));
				}
			}
			else if (nextData < x) {
				temp = temp.getRight();
				if (temp == null) {
					temp.setRight(new Node(n));
				}
			}
		}
	}

	public Node search(int n) {
		Node temp = root;
		while ((temp != null) && (temp.getData() != n)) {
			int data = temp.getData();
			if (data > n) {
				temp = temp.getLeft();
			}
			else if (data < n) {
				temp = temp.getRight();
			}
		}
		return temp;
	}

	public Node search (int n, Node t) {
		if (t == null) {
			return t;
		}
		int data = t.getData();
		else if (data == n) {
			return t;
		}
		else if (data > n) {
			return search(n, t.getLeft());
		}
		else {
			return search(n, t.getRight());
		}
	}
}
			

