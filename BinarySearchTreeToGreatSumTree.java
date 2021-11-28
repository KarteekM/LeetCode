
public class BinarySearchTreeToGreatSumTree {

	int sum = 0;

	public TreeNode bstToGst(TreeNode root) {

		if (null == root) {
			return null;
		}

		bstToGst(root.right);
		sum = sum + root.val;
		root.val = sum;
		bstToGst(root.left);

		return root;
	}

}
