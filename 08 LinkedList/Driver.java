// Nicholas Romanoff
// Period One
// Homework #08 Linked Lists
// 2014-03-19

public class Driver {

    public static void main(String[] args) {

	LinkedList l = new LinkedList();

	// 1
	System.out.println("\n1. Testing toString():");
	l.add("A");
	l.add("B");
	l.add("C");
	l.add("D");
	l.add("E");
	System.out.println("\n   " + l);

	// 2
	System.out.println("\n2. Testing add(int i, String s):");
	l.add(0, "Z");
	System.out.println("\n   0, Z    " + l);
	l.add(3, "N");
	System.out.println("   3, N    " + l);
	l.add(7, "Q");
	System.out.println("   7, Q    " + l);

	// 3
	System.out.println("\n3. Testing get(int i):");
	System.out.println("\n   0    " + l.get(0));
	System.out.println("   5    " + l.get(5));
	System.out.println("   7    " + l.get(7));

	// 4
	System.out.println("\n4. Testing set(int i, String s):");
	l.set(0, "R");
	System.out.println("\n   0, R    " + l);
	l.set(6, "X");
	System.out.println("   6, P    " + l);
	l.set(7, "H");
	System.out.println("   7, H    " + l);


	// 5
	System.out.println("\n5. Testing remove(int i):");
	l.remove(4);
	System.out.println("\n   4    " + l);
	l.remove(0);
	System.out.println("   0    " + l);
	l.remove(5);
	System.out.println("   5    " + l);

	// 6
	System.out.println("\n6. Testing find(String s)");
	System.out.println("\n   E    " + l.find("E"));
	System.out.println("   X    " + l.find("X"));
	System.out.println("   Q    " + l.find("Y"));

	// 7
	System.out.println("\n7. Testing length()");
	System.out.println("\n   " + l.length() + "\n");
	
    }
}
