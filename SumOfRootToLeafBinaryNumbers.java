
public class SumOfRootToLeafBinaryNumbers {
	int totalSum = 0;

	public int sumRootToLeaf(TreeNode root) {
		sumHelper(root, 0);
		return totalSum;
	}

	private void sumHelper(TreeNode root, int pathSum) {

		if (null == root) {
			return;
		}

		pathSum = 2 * pathSum + root.val;
		sumHelper(root.left, pathSum);
		sumHelper(root.right, pathSum);

		if (root.left == null && root.right == null) {
			this.totalSum += pathSum;
		}

	}
}
