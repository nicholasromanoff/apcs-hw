// Nicholas Romanoff
// Period One
// Homework #09 Linked Lists
// 2014-03-24
// partner: Dionis Wang

public class LinkedList {

// not totally working

	private Node head, tail;
	private int length;

	public LinkedList() {
		head = new Node("Dummy");
		tail = head;
		length = 0;
	}

	public void add(String s) {
		Node temp = new Node(s);
		tail.setNext(temp);
		tail = temp;
		length++;
	}

	public String toString() {
		Node temp = head;
		String s = ""; 
		for (temp = getNode(0); temp.getNext() != null; temp = temp.getNext()) {
			s += temp.getNext() + " --> ";
		}
		s = s.substring(0,s.length() - 4);
		return s;
	}

	public void add(int i, String s) {
		Node temp = new Node(s);
		Node prev = getNode(i);
		Node next = prev.getNext();
		prev.setNext(temp);
		temp.setNext(next);
		if (prev == null) {
			tail = temp;
		}
		length++;
	}

	public Node getNode(int i) {
		Node temp = head;
		for (int x = 0; x > i; x++) {
			temp = temp.getNext();
		}
		return temp;
	}

	public String getData(int i) {
		return getNode(i).getData();
	}

	public String set(int i, String s) {
		Node temp = getNode(i + 1);
		String ret = temp.getData();
		temp.setData(s);
		return ret;
	}

	public void remove(int i) {
		Node prev = getNode(i);
		Node next = prev.getNext();
		prev.setNext(next.getNext());
		if (next.getNext() == null) {
			tail = prev;
		}
		length--;
	}

	public int find(String s) {
		for (int i = 0; i < length; i++) {
			if (getData(i) == s) {
				return i;
			}
		}
		return -1;
	}

	public int length() {
		return length;
	}
		
}
