// Nicholas Romanoff
// Period One
// Homework #08 Linked Lists
// 2014-03-19

public class Node {

    private String data;
    private Node next;

    public Node(String s) {
	data = s;
    }
   
    public void setData(String s) {
	data = s;
    }

    public String getData() {
	return data;
    }

    public void setNext(Node n) {
	next = n;
    }

    public Node getNext() {
	return next;
    }

    public String toString() {
	return data;
    }
}
