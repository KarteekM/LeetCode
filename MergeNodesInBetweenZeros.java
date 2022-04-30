
public class MergeNodesInBetweenZeros {

	public ListNode mergeNodes(ListNode head) {
        
		 
		 if(null == head) {
			 return head;
		 }
		 ListNode temp = head;
		 ListNode newHead = null;
		 ListNode temp2 = null;
		 
		 int sum = 0;
		 while(temp!= null) {
			 if(temp.val != 0) {
				 sum = sum + temp.val;
			 }
			 else {
				 if(sum != 0) {
					 ListNode node = new ListNode(sum);
					 if(newHead == null) {
						 newHead = node;
						 temp2 = newHead;
					 }
					 else {
						 temp2.next = node;
						 temp2 = temp2.next;
					 }
					 
				 }
				 sum = 0;
			 }
			 temp= temp.next;
		 }
	        return newHead;
	    }

	public static void main(String[] args) {

	}
}
