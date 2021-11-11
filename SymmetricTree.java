
public class SymmetricTree {

	public SymmetricTree() {
		// TODO Auto-generated constructor stub
	}

	public boolean isSymmetric(TreeNode root) {

		if (null == root) {
			return true;
		}

		TreeNode left = root.left;
		TreeNode right = root.right;

		return isSymmetricHelper(left, right);

	}

	private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}

		if (left.val == right.val) {

			return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
		}

		return false;
	}

}
