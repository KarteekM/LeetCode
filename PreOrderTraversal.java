import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

	List<Integer> preOrder;

	public PreOrderTraversal() {
		preOrder = new ArrayList<Integer>();
	}

	//Recursion
	public List<Integer> preorderTraversal(TreeNode root) {

		if (null == root) {
			return this.preOrder;
		}

		preOrder.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);

		return preOrder;
	}
	
	//Iteration
	public List<Integer> preorderTraversal2(TreeNode root){
		
		if(null == root) {
			return preOrder;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode current = stack.pop();
			preOrder.add(current.val);
			if(current.right != null) {
				stack.push(current.right);
			}
			if(current.left != null) {
				stack.push(current.left);
			}
		}
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
		
		List<Integer> preOrderList = new PreOrderTraversal().preorderTraversal2(root);
		preOrderList.stream().forEach(element -> System.out.println(element));
		
	} 
}
