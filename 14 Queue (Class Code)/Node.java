// Nicholas Romanoff
// Period One
// Homework #13 RPN
// 2014-04-07

// no written assignment - code copied from class github

public class Node {

    private String data;
    private Node next;

    public Node(String d) {
	data = d;
	next = null;
    }

    public void setData(String d) {
	data = d;
    }
    public String getData() {
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext() {
	return next;
    }
    public String toString() {
	return ""+data;
    }

}
