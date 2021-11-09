import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

	List<Integer> preOrder;

	public PreOrderTraversal() {
		preOrder = new ArrayList<Integer>();
	}

	public List<Integer> preorderTraversal(TreeNode root) {

		if (null == root) {
			return this.preOrder;
		}

		preOrder.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);

		return preOrder;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1, null, null);
		CompleteBinaryTreeInserter inserter = new CompleteBinaryTreeInserter(root);
		inserter.insert(2);
		inserter.insert(3);
		inserter.insert(4);
		inserter.insert(5);
		inserter.insert(6);
		inserter.insert(7);
		inserter.insert(8);
		//inserter.printList();
		
		List<Integer> preOrderList = new PreOrderTraversal().preorderTraversal(root);
		preOrderList.stream().forEach(element -> System.out.println(element));
		
	} 
}
