import java.util.Stack;

public class ReorderList {
	
	 public void reorderList(ListNode head) {
		 
		 Stack<ListNode> stack = new Stack<ListNode>();
		 ListNode traverser = head;
		 while(traverser!= null) {
			 stack.push(traverser);
			 traverser = traverser.next;
		 }
		 
		 traverser = head;
		 int halfOfStack = stack.size()/2;
		 while(halfOfStack > 0) {
			 ListNode poppedNode = stack.pop();
			 ListNode temp = traverser.next;
			 traverser.next = poppedNode;
			 poppedNode.next = temp;
			 traverser = temp;
			 halfOfStack--;
			 if(halfOfStack == 0) {
				 traverser.next = null;
			 }
		 }
	  }
	 
	 public static void main(String[] args) {
			
			ListNode nodeObject = new ListNode();
			ListNode head = nodeObject.insert(null, 1);
			head = nodeObject.insert(head, 2);
			head = nodeObject.insert(head, 3);
			head = nodeObject.insert(head, 4);
			head = nodeObject.insert(head, 5);
			//nodeObject.printList(head);
			new ReorderList().reorderList(head);
			nodeObject.printList(head);
			
			System.out.println();
			System.out.println();
			
			 nodeObject = new ListNode();
			 head = nodeObject.insert(null, 1);
			head = nodeObject.insert(head, 2);
			head = nodeObject.insert(head, 3);
			head = nodeObject.insert(head, 4);
			//nodeObject.printList(head);
			new ReorderList().reorderList(head);
			nodeObject.printList(head);
			
			
		}

}
