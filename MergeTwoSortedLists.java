
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
			
			if(l1.val <= l2.val ) {
				traverser.next = l1;
				l1 = l1.next;
			}
			else {
				traverser.next = l2;
				l2 = l2.next;
			}
			
			traverser = traverser.next;
			
		}
		
		if( l1 != null) {
			
			traverser.next = l1;
		}
		else if( l2 != null) {
			traverser.next = l2;
		}

		return head;

	}
	
	public static void main(String[] args) {
		
	}

}
