// Nicholas Romanoff
// Period One
// Homework #12 Stack with Array
// 2014-04-06

public class Driver {

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.push("four");
	stack.push("five");
	stack.push("six");
	stack.push("seven");
	stack.push("eight");
	stack.push("nine");
	stack.push("ten");
	stack.push("eleven");
	stack.push("twelve");

	System.out.println(stack);
	while (!stack.isEmpty()){
	    System.out.println(stack.pop());
	}
	stack.push("hello");
	stack.push("world");
	System.out.println(stack.peek());

    }

}
