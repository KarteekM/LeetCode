
public class KthSmallestNodeInBinaryTree {
	
	int count = 0;
	int result = Integer.MIN_VALUE;
	
	 public int kthSmallest(TreeNode root, int k) {
		traverseAndUpdateTheCount(root,k);
		return result;
		  
	    }

	private void traverseAndUpdateTheCount(TreeNode root, int k) {
		if(null == root)
			return;
		traverseAndUpdateTheCount(root.left,k);
		++count;
		if(count == k) {
			result = root.val;
		}
		traverseAndUpdateTheCount(root.right,k);
	}

}
