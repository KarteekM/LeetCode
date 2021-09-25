
public class ReverseALinkedList {
	
	 public ListNode reverseList(ListNode head) {
	        
	        ListNode curr = head;
	        ListNode prev = null;
	        ListNode next = null;
	        
	        if(head ==null || head.next == null)
	            return head;
	        
	        while(curr != null){
	            next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;            
	        }
	        head = prev;
	        
	        return head;
	    }

}
