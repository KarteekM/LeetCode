import java.util.ArrayList;
import java.util.List;

class ListNode3 {
	int val;
	ListNode3 next;

	ListNode3() {
	}

	ListNode3(int val) {
		this.val = val;
	}

	ListNode3(int val, ListNode3 next) {
		this.val = val;
		this.next = next;
	}

	public ListNode3 insert(int val) {

		ListNode3 node = new ListNode3(val, next);
		next = node;
		return next;
	}

	void printNodes(ListNode3 head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}

public class ConvertBinaryNumberToLinkedList {

	public int getDecimalValue(ListNode3 head) {

		int decimal = 0;
		if (null == head)
			return 0;

		List<Integer> binaryNumber = new ArrayList<Integer>();

		while (head != null) {
			binaryNumber.add(head.val);
			head = head.next;
		}

		int sizeOfStack = binaryNumber.size();
		for (int i = sizeOfStack - 1; i > -1; i--) {
			int n = binaryNumber.get(i);
			decimal = decimal + (n * (int) Math.pow(2, i));
		}
		return decimal;
	}

	public static void main(String[] args) {

		ListNode3 listNodeObject = new ListNode3();
		listNodeObject.insert(1);
		listNodeObject.insert(0);
		listNodeObject.insert(1);
		// listNodeObject.printNodes(listNodeObject.next);
		ConvertBinaryNumberToLinkedList linkedlistObject = new ConvertBinaryNumberToLinkedList();
		System.out.println(linkedlistObject.getDecimalValue(listNodeObject.next));

		listNodeObject = new ListNode3();
		listNodeObject.insert(0);
		linkedlistObject = new ConvertBinaryNumberToLinkedList();
		System.out.println(linkedlistObject.getDecimalValue(listNodeObject.next));

		listNodeObject = new ListNode3();
		listNodeObject.insert(1);
		linkedlistObject = new ConvertBinaryNumberToLinkedList();
		System.out.println(linkedlistObject.getDecimalValue(listNodeObject.next));

		listNodeObject = new ListNode3();
		listNodeObject.insert(1);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		listNodeObject.insert(1);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		listNodeObject.insert(1);
		listNodeObject.insert(1);
		listNodeObject.insert(1);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		linkedlistObject = new ConvertBinaryNumberToLinkedList();
		System.out.println(linkedlistObject.getDecimalValue(listNodeObject.next));
		
		listNodeObject = new ListNode3();
		listNodeObject.insert(0);
		listNodeObject.insert(0);
		linkedlistObject = new ConvertBinaryNumberToLinkedList();
		System.out.println(linkedlistObject.getDecimalValue(listNodeObject.next));


	}

}
