
public class SumOfTwoBinaryTrees {

	public SumOfTwoBinaryTrees() {
		// TODO Auto-generated constructor stub
	}

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

		if (null == root1 && null == root2) {
			return null;
		}

		int sum = 0;
		if (root1 == null && root2 != null) {
			sum = 0 + root2.val;
		}
		if (root1 != null && root2 == null) {
			sum = root1.val + 0;
		}

		if(root1 != null && root2 != null) {
			sum = root1.val + root2.val;
		}
		
		TreeNode node = new TreeNode(sum);
		node.left =  mergeTrees((root1 == null) ? null : root1.left,(root2 == null) ? null : root2.left);
		node.right = mergeTrees((root1 == null) ? null : root1.right, (root2 == null) ? null : root2.right); 
		
		return node;
	}

}
