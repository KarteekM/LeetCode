class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {

		if (null == head || null == head.next)
			return head;

		ListNode currentNode = head;
		ListNode nextNode = currentNode.next;
		while (nextNode != null) {
			while (nextNode != null && (currentNode.val == nextNode.val)) {
				nextNode = nextNode.next;
			}
			currentNode.next = nextNode;
			if (null != nextNode) {
				nextNode = nextNode.next;
				currentNode = currentNode.next;
			}

		}
		return head;

	}
}
