import java.util.Deque;
import java.util.LinkedList;

public class ImplementStackUsingQueues {

	Deque<Integer> deque;

	public ImplementStackUsingQueues() {
		deque = new LinkedList<Integer>();
	}

	public void push(int x) {
		deque.add(x);
	}

	public int pop() {
		return deque.removeLast();

	}

	public int top() {
		return deque.peekLast();

	}

	public boolean empty() {
		return (deque.size() == 0);
	}

}
