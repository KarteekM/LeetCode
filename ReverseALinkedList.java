
public class ReverseALinkedList {

	//Iteration
	public ListNode reverseList(ListNode head) {

		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;

		if (head == null || head.next == null)
			return head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

		return head;
	}

	//Recursion
	ListNode prev = null;
	public ListNode reverseList2(ListNode head) {
		if(null == head || null == head.next) {
			return head;
		}
		
		
		ListNode curr = head;
		ListNode next = curr;
		helper(curr,next);
		 return prev;
	}

	private void helper(ListNode curr,ListNode next) {
		if(next == null) {
			return;
		}
		 
		next = next.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		helper(curr,next);
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		  head.next = new ListNode(2); 
			
			  head.next.next = new ListNode(3); head.next.next.next = new ListNode(4);
			  head.next.next.next.next = new ListNode(5);
			 
		 
		ListNode result = new ReverseALinkedList().reverseList2(head);
	    
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	 
		
	}
}
