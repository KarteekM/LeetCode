import java.util.ArrayList;
import java.util.List;

public class MinStack {

	List<Integer> stack;
	int top = -1;

	public MinStack() {
		stack = new ArrayList<Integer>();
	}

	public void push(int val) {
		stack.add(val);
		top++;

	}

	public void pop() {
		stack.remove(top);
		top--;
	}

	public int top() {
		int topOfStack = stack.get(top);
		return topOfStack;
	}

	public int getMin() {

		int min = Integer.MAX_VALUE;
		for (Integer number : stack) {
			if (number < min)
				min = number;
		}
		return min;

	}
	
	public static void main(String[] args) {
		/*
		 * MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
		 * minStack.push(-3); System.out.println(minStack.getMin()); // return -3
		 * minStack.pop(); System.out.println(minStack.top()); // return 0
		 * System.out.println(minStack.getMin()); // return -2
		 */	
	
	  MinStack minStack = new MinStack();
	  minStack.push(2);
	  minStack.push(0);
	  minStack.push(3);
	  minStack.push(0);
	  minStack.getMin(); // return 0
	  minStack.pop(); // removes 0
	  minStack.getMin(); // return 0
	  minStack.pop(); //removes 3
	  minStack.getMin(); // return 0
	  minStack.pop(); // removes 0
	  minStack.getMin(); //return 2
	  
	}
	  

}
