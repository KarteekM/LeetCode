import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {


	List<Integer> postOrder;

	 public PostOrderTraversal() {
		postOrder = new ArrayList<Integer>();
	}

	public List<Integer> postorderTraversal(TreeNode root) {

		if (null == root) {
			return this.postOrder;
		}

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		postOrder.add(root.val);

		return postOrder;
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
		
		List<Integer> postOrder = new PostOrderTraversal().postorderTraversal(root);
		postOrder.stream().forEach(element -> System.out.println(element));
		
	} 

}
