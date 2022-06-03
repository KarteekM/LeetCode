
public class MergeTwoSortedLists {

	ListNode createNewNode(int number) {
		ListNode newNode = new ListNode(number);
		return newNode;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}

		if (l1 == null && l2 != null) {
			return l2;
		}

		if (l2 == null && l1 != null) {
			return l1;
		}

		ListNode head = new ListNode(-1);
		ListNode traverser = head;
		while (l1 != null && l2 != null) {

			if (l1.val <= l2.val) {
				traverser.next = l1;
				l1 = l1.next;
			} else {
				traverser.next = l2;
				l2 = l2.next;
			}

			traverser = traverser.next;

		}

		if (l1 != null) {

			traverser.next = l1;
		} else if (l2 != null) {
			traverser.next = l2;
		}

		return head;

	}

	ListNode traverser;

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		ListNode head = new ListNode(-1);
		traverser = head;
		helper(l1, l2);
		return head.next;

	}

	private void helper( ListNode l1, ListNode l2) {
		if (l1 != null && l2 != null) {

			if (l1.val <= l2.val) {
				traverser.next = l1;
				l1 = l1.next;
			} else {
				traverser.next = l2;
				l2 = l2.next;
			}
			traverser = traverser.next;

		}

		if (l1 == null && l2 == null) {
			return;
		}

		else if (l1 != null && l2 == null) {
			traverser.next = l1;
			return;
		}

		else if (l1 == null && l2 != null) {
			traverser.next = l2;
			return;
		}

		helper(l1, l2);
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);
		l1.next.next.next = new ListNode(7);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);
		l2.next.next.next = new ListNode(8);

		ListNode result = new MergeTwoSortedLists().mergeTwoLists2(l1, l2);
	}

}
