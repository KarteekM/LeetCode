import java.util.Stack;

public class ConstructBinaryTreeFromPreAndInOrder {

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode root = new TreeNode(preorder[0]);
		TreeNode nodeRemovedFromStack = null;
		stack.push(root);
		for (int i = 1, j = 0; i < preorder.length; i++) {
			while (j < preorder.length && !stack.isEmpty() && stack.peek().val == inorder[j]) {
				j++;
				nodeRemovedFromStack = stack.pop();
			}

			TreeNode newNode = new TreeNode(preorder[i]);
			if (nodeRemovedFromStack == null) {
				stack.peek().left = newNode;
			} else {
				nodeRemovedFromStack.right = newNode;
			}
			stack.push(newNode);
			nodeRemovedFromStack = null;
		}
		return root;
	}
}
