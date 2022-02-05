
public class MaximumDistanceBetweenNodeAndAncestor {
	int diff = 0;

	public int maxAncestorDiff(TreeNode root) {

		if (null == root) {
			return diff;
		}
		helper(root, root.val, root.val);
		return diff;
	}

	private void helper(TreeNode root, int min, int max) {
		  min = Math.min(root.val,min);
	      max = Math.max(root.val,max);
		diff = Math.max(diff, max - min);
		if(root.left != null) {
			helper(root.left, min, max);
		}
		
		if(root.right != null) {
			helper(root.right, min,max);
		}

	}
}
