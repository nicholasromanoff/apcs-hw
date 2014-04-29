// Nicholas Romanoff
// Period One
// Homework #16 Binary Search Tree Part One
// 2014-04-27

public class Driver {

    public static void main(String[] args){
	BinarySearchTree bst = new BinarySearchTree(10);
	bst.search(10);
	bst.insert(3);
	bst.insert(12);
	System.out.println(bst.search(4));
	System.out.println(bst.search(3));
	System.out.println(bst.search(12));

    }
}	
