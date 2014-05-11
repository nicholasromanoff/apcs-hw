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
		Node current = root;
		Node next = root;
		while (next != null) {
			current = next;
			if (n > current.getData()) {
				next = current.getRight();
			}
			else {
				next = current.getLeft();
			}
		}
		if (n > current.getData()) {
			current.setRight(new Node(n));
		}
		else {
			current.setLeft(new Node(n));
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

	public Node search(int n, Node t) {
		if (t == null) {
			return t;
		}
		else if (t.getData() == n) {
			return t;
		}
		else if (t.getData() > n) {
			return search(n, t.getLeft());
		}
		else {
			return search(n, t.getRight());
		}
	}

	public void delete(int n) {
		if (search(n) == null) {
			return;
		}
		Node target = search(n);
		Node parent = findParent(n);
		if ((target.getRight() == null) || (target.getLeft() == null))) {
			boolean leaf = (target.getRight() == null) ^ (target.getLeft() == null)
			boolean parentLeft = (parent.getLeft().getData() == n);
			boolean targetLeft = (target.getLeft().getData() != null);
			if (leaf && parentLeft) {
				parent.setLeft(null);
			}
			else if (leaf && !(parentLeft)) {
				parent.setRight(null);
			}
			else {
				if (parentLeft && targetLeft) {
					parent.setLeft(target.getLeft);
				}
				else if (parentLeft && targetRight) {
					parent.setLeft(target.getRight);
				}
				else if (parentRight && targetLeft) {
					parent.setRight(target.getLeft);
				}
				else {
					parent.setRight(target.getRight);
				}
			}
		}
		else {
			Node temp = target.getLeft();
			while (temp.getRight() != null) {
				temp = temp.getRight();
			}			
			boolean left = (parent.getLeft().getData() == n);	
			if (left) {
				parent.setLeft(temp);
			}
			else {
				parent.setRight(temp);
			}		
		}
	}
		


	public Node findParent(int n) {
		Node current = root;
		if (n = root.getData()) {
			return null;
		}
		while (current != null) {
			if ((current.getRight().getData() == n) ||
			    (current.getLeft().getData() == n)) {
				return current;	
			}
			else if (n > current.getData()) {
				current = current.getRight();
			}
			else (n < current.getData()) {
				current = current.getLeft();
			}
		}
	}
}

		

		
			







}
			

