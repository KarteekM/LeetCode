import java.util.Stack;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		
		if(null == head || head.next == null) {
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode middle = slow;
		ListNode traverser = head;
		Stack<ListNode> stack = new Stack<ListNode>();
		while (traverser != middle) {
			stack.push(traverser);
			traverser = traverser.next;
		}

		if (fast != null) {
			traverser = traverser.next;
		}

		while (stack.size() > 0) {
			if (traverser.val == stack.pop().val) {
				traverser = traverser.next;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	 public static void main(String[] args) {
		 
		 //Only 2
		 ListNode nodeObject = new ListNode();
		 ListNode head = nodeObject.insert(null, 1);
		 nodeObject.insert(head, 1);
		 System.out.println(new PalindromeLinkedList().isPalindrome(head));
		
		 //Even List
		 nodeObject = new ListNode();
		 head = nodeObject.insert(null, 1);
		 nodeObject.insert(head, 2);
		 nodeObject.insert(head, 2);
		 nodeObject.insert(head, 1);
		// nodeObject.printList(head);
		 System.out.println(new PalindromeLinkedList().isPalindrome(head));
		 
		 System.out.println("Odd list as follows");
		 //Odd List
		  nodeObject = new ListNode();
		 head = nodeObject.insert(null, 1);
		 nodeObject.insert(head, 2);
		 nodeObject.insert(head, 3);
		 nodeObject.insert(head, 2);
		 nodeObject.insert(head, 1);
		// nodeObject.printList(head);
		 System.out.println(new PalindromeLinkedList().isPalindrome(head));
	}
}
