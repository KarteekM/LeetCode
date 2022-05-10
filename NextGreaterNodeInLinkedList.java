import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {

	public int[] nextLargerNodes(ListNode head) {

		List<Integer> result = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();

		if (null == head) {
			int[] emptyArr = {};
			return emptyArr;
		}

		while (head != null) {
			result.add(head.val);
			head = head.next;
		}
		int resArray[] = new int[result.size()];
		if (resArray.length == 1) {
			resArray[0] = 0;
			return resArray;
		}

		for (int i = 0; i < result.size(); i++) {
			while (!stack.isEmpty() && result.get(stack.peek()) < result.get(i)) {
				int index = stack.pop();
				resArray[index] = result.get(i);
			}
			stack.add(i);
		}

		return resArray;

	}

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		/*
		 * ListNode node1 = new ListNode(1); head.next = node1; ListNode node2 = new
		 * ListNode(5); node1.next = node2;
		 */

		int[] res = new NextGreaterNodeInLinkedList().nextLargerNodes(head);
	}

}
