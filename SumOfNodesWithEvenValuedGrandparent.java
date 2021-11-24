
public class SumOfNodesWithEvenValuedGrandparent {

	int sum = 0;
	public SumOfNodesWithEvenValuedGrandparent() {
		// TODO Auto-generated constructor stub
	}

	 public int sumEvenGrandparent(TreeNode root) {
		 return helper(root,null,null);
	    }

	private int helper(TreeNode root, TreeNode parent, TreeNode grandParent) {
		
	
		if(null == root) {
			return 0;
		}
		
		if(grandParent != null && grandParent.val%2 == 0) {
			sum = sum + root.val;
		}
		helper(root.left, root, parent);
		helper(root.right, root, parent);
		
		return sum;
		
	}
}
