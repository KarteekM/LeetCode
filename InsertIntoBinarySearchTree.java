
public class InsertIntoBinarySearchTree {

	public InsertIntoBinarySearchTree() {
		// TODO Auto-generated constructor stub
	}

	public TreeNode insertIntoBST(TreeNode root, int val) {
		
		if(null == root) {
			return new TreeNode(val);
		}
		
		if(val < root.val && root.left == null) {
			TreeNode newNode = new TreeNode(val);
			root.left = newNode;
		}
		else if(val > root.val && root.right == null) {
			TreeNode newNode = new TreeNode(val);
			root.right = newNode;
		}
		else if(val < root.val) {
			insertIntoBST(root.left, val);
		}
		else if(val >= root.val) {
			insertIntoBST(root.right, val);
		}
		
		return root;
	}
}
