
public class ReverseNodesInKGroup {
 
	/*Solved in both iterative and recursive approach
	 * 
	 */
	
	//iterative
	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pointer = dummy;

		while (pointer != null) {

			ListNode node = pointer;

			// Check if there are valid number of nodes to reverse
			for (int i = 0; i < k && node != null; i++) {
				node = node.next;
			}

			if (null == node)
				break;

			// We have reached a point where we need to start reversing the nodes.
			ListNode prev = null;
			ListNode next = null;
			ListNode curr = pointer.next;
			int l = k;
			while (l > 0) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				l--;
			}

			ListNode tail = pointer.next;
			tail.next = curr;
			pointer.next = prev;
			pointer = tail;
		}

		return dummy.next;
	}

	//recursive
	public ListNode reverseKGroup2(ListNode head, int k) {

		if (null == head) {
			return null;
		}

		ListNode sizeValidator = head;
		for (int i = 0; i < k; i++) {

			if (sizeValidator != null) {
				sizeValidator = sizeValidator.next;
			} else {
				return head;
			}
		}

		ListNode prev = null;
		ListNode next = null;
		ListNode curr = head;
		int l = k;
		while (l > 0) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			l--;
		}
		if (next != null) {
			head.next = reverseKGroup(next, k);
		}

		return prev; // prev is the new head ( reversed head )
	}

}
