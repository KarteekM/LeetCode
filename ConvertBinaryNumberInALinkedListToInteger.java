
public class ConvertBinaryNumberInALinkedListToInteger {

	  public int getDecimalValue(ListNode head) {
	      
		 
		  if(head == null) {
			  return 0;
		  }
		  
		 int sum = 0;
		 int prev = 0;
		 
		 while(head != null) {
			 sum = prev * 10 + head.val;
			 prev = sum;
			 head = head.next;
		 }
		 
		 return sum;
		  
		  
	    }
}
