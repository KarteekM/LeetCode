
public class MergeTwoBinaryTrees {
	int sum;

	public MergeTwoBinaryTrees() {
		sum = 0;
	}

	public int rangeSumBST(TreeNode root, int low, int high) {

		if (null == root) {
			return sum;
		}

		if (root.val < low) {
			rangeSumBST(root.right, low, high);
		} else if (root.val > high) {
			rangeSumBST(root.left, low, high);
		}

		else if (low <= root.val && root.val <= high) {
			sum = sum + root.val;
			rangeSumBST(root.right, low, high);
			rangeSumBST(root.left, low, high);

		}

		return sum;

	}
}
