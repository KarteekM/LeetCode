
public class SearchInABinarySearchTree {

	TreeNode mainRoot = null;
	
public TreeNode searchBST(TreeNode root, int val) {
	
	if(null == root) {
		return root;
	}
	  
	  if(root.val == val) {
		  mainRoot = root;
		  return mainRoot;
	  }
	
	  else if(root.val < val) {
		  searchBST(root.right,val);
	  }
	  else if(root.val > val) {
		  searchBST(root.left,val);
	  }
	  
       return mainRoot;
    }

}
