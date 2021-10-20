import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ReorderList {
	
	//Using stack
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
	 
	 
	 //Using Deque
	 public void reorderList2(ListNode head) {
		 
		 Deque<ListNode> deque = new LinkedList<ListNode>();
		 while(head!=null) {
			 deque.addLast(head);
			 head = head.next;
		 }
		 
		 head = null;
		 ListNode node = null;
		while(deque.size() > 0) {
			
			if(null == head) {
				node = deque.removeFirst();
				head = node;
			}
			else {
			  node.next = deque.removeFirst();
			  node = node.next;
			}
			
			if(deque.size() > 0) {
				node.next = deque.removeLast();
				node = node.next;
			}
			
			
		}
		node.next = null;
		 
		 
	 }
	 
	 public static void main(String[] args) {
			
			ListNode nodeObject = new ListNode();
			ListNode head = nodeObject.insert(null, 1);
			head = nodeObject.insert(head, 2);
			head = nodeObject.insert(head, 3);
			head = nodeObject.insert(head, 4);
			head = nodeObject.insert(head, 5);
			//nodeObject.printList(head);
			new ReorderList().reorderList2(head);
			nodeObject.printList(head);
			
			System.out.println();
			System.out.println();
			
			 nodeObject = new ListNode();
			 head = nodeObject.insert(null, 1);
			head = nodeObject.insert(head, 2);
			head = nodeObject.insert(head, 3);
			head = nodeObject.insert(head, 4);
			//nodeObject.printList(head);
			new ReorderList().reorderList2(head);
			nodeObject.printList(head);
			
			
		}

}
