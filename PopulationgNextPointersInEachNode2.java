import java.util.LinkedList;
import java.util.Queue;

public class PopulationgNextPointersInEachNode2 {

	public Node2 connect(Node2 root) {

		if (null == root) {
			return null;
		}

		Queue<Node2> queue = new LinkedList<Node2>();
		queue.add(root);

		Node2 temp = null;
		while (!queue.isEmpty()) {
			
			
		}
		return root;
	}

	public static void main(String[] args) {
		Node2 head = new Node2(1);
		head.left = new Node2(2);
		head.right = new Node2(3);
		head.left.left = new Node2(4);
		head.left.right = new Node2(5);

		Node2 result = new PopulationgNextPointersInEachNode2().connect(head);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

}
