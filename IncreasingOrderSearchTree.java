public class IncreasingOrderSearchTree {
	
	TreeNode head = null, previousNode = null;
	public IncreasingOrderSearchTree() {
		// TODO Auto-generated constructor stub
	}
	
	 public TreeNode increasingBST(TreeNode root) {
		 
		 if(null == root) {
			 return null;
		 }
		
		increasingBST(root.left);
		
		if(null == head) {
			head = root;
		}
		
		if(previousNode != null) {
			root.left = null;
			previousNode.right = root;
		}
		
		previousNode = root;
		increasingBST(root.right);
		
		 return null;
	    }
	 
	 public static void main(String[] args) {
		 


			TreeNode root = new TreeNode(1, null, null);
			CompleteBinaryTreeInserter inserter = new CompleteBinaryTreeInserter(root);
			inserter.insert(2);
			inserter.insert(3);
			inserter.insert(4);
			inserter.insert(5);
			inserter.insert(6);
			inserter.insert(7);
			inserter.insert(8);
			// inserter.printList();

			new IncreasingOrderSearchTree().increasingBST(root);
			//inOrderTraversal.stream().forEach(element -> System.out.println(element));

		
		 
	 }

}
