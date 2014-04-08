// Nicholas Romanoff
// Period One
// Homework #13 Stack with Array
// 2014-04-07

import java.util.Scanner;

public class RPN {

	private MyStack stack;
	private static final String operators = "+-*/";

	public RPN() {
		stack = new MyStack();
	}

	public void run() {
		System.out.println("\nWelcome to the RPN Postfix Calculator!");
		System.out.println("\nfollow the instructions to input information");
		System.out.println("return the word 'off' to close the program");
		System.out.println("return the word 'clear' clear your data");
		System.out.println("\nplease type and then press Enter: \n");
		while (true) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			if (input.equals("off")) {
				break;
			}
			else if (input.equals("clear")) {
				stack = new MyStack();
			}
			else if (operators.indexOf(input) >= 0) {
				operate(input);
			}
			else {
				stack.push(input);
			}
		}
	}

	public void operate(String operator) {
		Double termB = Double.parseDouble(stack.pop());
		Double termA = Double.parseDouble(stack.pop());
		Double result;
		if (operator.equals("+")) {
			result = termA + termB;
		}
		else if (operator.equals("-")) {
			result = termA - termB;
		}
		else if (operator.equals("*")) {
			result = termA * termB;
		}
		else {
			result = termA / termB;
		}
		stack.push(termA + " " + operator + " " + termB + " = " + result);
		System.out.println(stack);
	}

	// so little code driver file seems unnecessary
	public static void main(String[] args){
		RPN rpn = new RPN();
		rpn.run();
	}
}
