
public class MinimumDepthOfATree {

	public int minDepth(TreeNode root) {
		
		if(null == root)
			return 0;
		
		//A leaft node
		if(null == root.left && null == root.right)
			return 1;
		
		   int leftCount = minDepth(root.left);
		   int rightCount = minDepth(root.right);
		   
		   if(null == root.left) {
			   return rightCount + 1;
		   }
		   
		   if(null == root.right) {
			   return leftCount + 1;
		   }
		   
		   return Math.min(leftCount, rightCount) + 1;

	}

}
