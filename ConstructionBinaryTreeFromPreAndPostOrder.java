import java.util.Stack;

public class ConstructionBinaryTreeFromPreAndPostOrder {

	 public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
	         
	   Stack<TreeNode> stack = new Stack<TreeNode>();
	   TreeNode root = new TreeNode(preorder[0]);
	   stack.push(root);
	   for(int i=1, j = 0;i<preorder.length;i++) {
		   
		   while(stack.peek().val == postorder[j]) {
			   stack.pop();
			   j++;
		   }
		  
			   TreeNode node = null;
			   if(stack.peek().left == null) {
				   node = new TreeNode(preorder[i]);
				   stack.peek().left = node;
			   }
			   else if(stack.peek().right == null){
				   node = new TreeNode(preorder[i]);
				   stack.peek().right = node;
			   }
			   stack.push(node);
	   }
	   return root;
	 }	

}
