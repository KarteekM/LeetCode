import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ReorderList {
	
	public void reorderList(ListNode head) {
		
		if (head == null || head.next == null)
			return;
		
		//Find middle
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while(fast != null && fast.next != null) {
			prev = slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		prev.next = null;
		ListNode reversedListHead = reverse(slow);
		
		//Reorder
		ListNode traverser = head;
		
		while(traverser!= null) {
			ListNode next1 = traverser.next;
			ListNode next2 = reversedListHead.next;
			traverser.next = reversedListHead;
			
			if(next1 != null) {
				reversedListHead.next = next1;
			}
			
			traverser = next1;
			reversedListHead = next2;
		}
		
	}
	
	

	private ListNode reverse(ListNode head) {
		
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head;
		
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



	//Using stack
	 public void reorderList1(ListNode head) {
		 
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
			new ReorderList().reorderList(head);
			nodeObject.printList(head);
			
		 
		 	
			/*
			 * ListNode nodeObject = new ListNode(); ListNode head = nodeObject.insert(null,
			 * 1); head = nodeObject.insert(head, 2); head = nodeObject.insert(head, 3);
			 * head = nodeObject.insert(head, 4); head = nodeObject.insert(head, 5);
			 * //nodeObject.printList(head); new ReorderList().reorderList(head);
			 * nodeObject.printList(head);
			 * 
			 * System.out.println(); System.out.println();
			 * 
			 * nodeObject = new ListNode(); head = nodeObject.insert(null, 1); head =
			 * nodeObject.insert(head, 2); head = nodeObject.insert(head, 3); head =
			 * nodeObject.insert(head, 4); //nodeObject.printList(head); new
			 * ReorderList().reorderList(head); nodeObject.printList(head);
			 */
		}

}
