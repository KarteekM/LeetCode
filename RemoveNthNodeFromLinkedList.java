
public class RemoveNthNodeFromLinkedList {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	       ListNode slow = head; 
	       ListNode fast = head; 
	        
	        while(n > 0){
	            fast = fast.next;
	            n = n - 1;
	        }
	   
	        if(fast == null){
	          return head.next;
	      }
	        
	       
	      while(fast.next != null){
	          slow = slow.next;
	          fast = fast.next;
	      }
	      slow.next = slow.next.next;
	        
	     return head;
	        
	    }
	
}
