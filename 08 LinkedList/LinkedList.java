// Nicholas Romanoff
// Period One
// Homework #08 Linked Lists
// 2014-03-19

public class LinkedList {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void add(String s) {
		Node temp = new Node(s);
		temp.setNext(head);
		head = temp;
	}

	public String toString() {
		Node temp = head;
		String s; 
		s = head.getData() + " --> ";
		while (temp.getNext() != null) {
			s += temp.getNext() + " --> ";
			temp = temp.getNext();
		}
		s = s.substring(0,s.length() - 4);
		return s;
	}

	public void add(int i, String s) {
		if (i == 0) {
			add(s);
		}
		else {
			Node n = new Node(s);
			Node temp = head;
			while (i > 1) {
				temp = temp.getNext();
				i--;
			}
			n.setNext(temp.getNext());
			temp.setNext(n);
		}
	}

	public String get(int i) {
		if (i == 0) {
			return head.getData();
		}
		else {
			Node temp = head;
			while (i > 0) {
				temp = temp.getNext();
				i--;
			}
			return temp.getData();
		}
	}

	public String set(int i, String s) {
		String ret = head.getData();
		if (i == 0) {
			head.setData(s);
			return ret;
		}
		else {
			Node temp = head;
			while (i > 0) {
				temp = temp.getNext();
				i--;
			}
			ret = temp.getData();
			temp.setData(s);
			return ret;
		}
	}

	public void remove(int i) {
		if (i == 0) {
			head = head.getNext();
		}
		else {
			Node temp = head;
			while (i > 1) {
				temp = temp.getNext();
				i--;
			}
			temp.setNext(temp.getNext().getNext());
		}
	}

	public int find(String s) {
		Node temp = head;
		int index = 0;
		if (head.getData() == s) {
			return index;
		}
		index++;
		while (temp.getNext() != null) {
			if (temp.getNext().getData() == s) {
				return index;
			}
			else {
				temp = temp.getNext();
				index++;
			}
		}
		return -1;
	}

	public int length() {
		int count = 1;
		Node temp = head;
		while (temp.getNext() != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}


			


			
}
