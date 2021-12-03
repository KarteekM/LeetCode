
public class ConstructBinarySearchTreeFromPreOrderTraversal {

	public TreeNode bstFromPreorder(int[] preorder) {
		
		TreeNode root = null;
		for(Integer number: preorder) {
		 root =	insert(root,number);
		}
		
		return root;
	}

	private TreeNode insert(TreeNode root, Integer number) {
		
		  if(null == root) {
			  root = new TreeNode(number, null, null);
		  }
		  
		  else if(root.val > number) {
			  root.left = insert(root.left, number);
		  }
		  else {
			  root.right = insert(root.right, number);
		  }
		return root;
	}

}
