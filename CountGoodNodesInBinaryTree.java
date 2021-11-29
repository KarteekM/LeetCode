
public class CountGoodNodesInBinaryTree {

	
	int sumOfGoodValues;

	public CountGoodNodesInBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	public int goodNodes(TreeNode root) {
		
		int maxValue = Integer.MIN_VALUE;
		helper(root, maxValue);
		return sumOfGoodValues;
	}

	private void helper(TreeNode root, int maxValue) {

		if (null == root) {
			return;
		}

		if (root.val >= maxValue) {
			maxValue = root.val;
			sumOfGoodValues++;
		}
		helper(root.left, maxValue);
		helper(root.right, maxValue);
	}

}
