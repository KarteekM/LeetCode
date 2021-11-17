import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {

	public FlattenBinaryTreeToLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void flatten(TreeNode root) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (null == root) {
			return;
		}
		
		TreeNode currentNode = root;
		TreeNode previousNode = null;
		stack.push(currentNode);
		
		while(!stack.isEmpty()) {
			
			 currentNode = stack.pop();
			 if(previousNode != null) {
				 previousNode.left = null;
				 previousNode.right = currentNode;
			 }
			 if(currentNode.right != null) {
				 stack.push(currentNode.right);
			 }
			 if(currentNode.left != null) {
				 stack.push(currentNode.left);
			 }
			previousNode = currentNode;
		}
		

	}
}
