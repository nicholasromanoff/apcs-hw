// Nicholas Romanoff
// Period One
// Homework #13 RPN
// 2014-04-07

public class MyStack {

    private String[] stack;
    private int top;

    public MyStack(){
	stack = new String[10];
	top = -1;
    }

    public  void push(String s){
	if (top + 1 == stack.length) {
		expand();
	}
	top++;
	stack[top] = s;
    }

    private void expand() { 
        String[] b = new String[stack.length*2];
	for (int i = 0; i < stack.length; i++)
	    b[i] = stack[i];
	stack = b;
    }

    public String pop() {
	String s = stack[top];
	stack[top] = null;
	top--;
	return s;
    }

    public String peek() {
	return stack[top];
    }

    public boolean isEmpty() {
	return (top < 0);
    }

    public int getSize() {
	return top + 1;
    }
    
    public String toString(){
	String tmp = "";
	for (int x = 0; x < getSize(); x++) {
		tmp += stack[x] + " ";
	}
	return tmp;
    }
}
