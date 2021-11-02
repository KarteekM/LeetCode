
public class ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {

		if (null == root) {
			return false;
		}
		return helperForCheckingBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

	}

	private boolean helperForCheckingBST(TreeNode root, long minValue, long maxValue) {
		if (null == root) {
			return true;
		}

		if (root.val <= minValue || root.val >= maxValue)
			return false;

		return true && helperForCheckingBST(root.left, minValue, root.val)
				&& helperForCheckingBST(root.right, root.val, maxValue);

	}

}
