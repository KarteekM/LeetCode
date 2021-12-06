
public class DiameterOfBinaryTree {

	 public int diameterOfBinaryTree(TreeNode root) {
	     
		  if(null == root) {
			  return 0;
		  }
		
		  int currentDiameter = maxDepth(root.left) + maxDepth(root.right);
		  int leftDiameter = diameterOfBinaryTree(root.left);
		  int rightDiameter = diameterOfBinaryTree(root.right);
		  return Math.max(Math.max(leftDiameter, rightDiameter), currentDiameter);
		  
	    }

	private int maxDepth(TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		return (1 + Math.max(maxDepth(node.left), maxDepth(node.right)));
	}
}
