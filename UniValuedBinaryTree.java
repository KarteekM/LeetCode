
public class UniValuedBinaryTree {

public boolean isUnivalTree(TreeNode root) {
        
		boolean isUnivalForTheCurrentNode = true;
        if(null == root){
            return true;
        }
        
        if(root.left != null && root.left.val == root.val) {
        	isUnivalForTheCurrentNode = true;
        }
        
        else if(root.left != null && root.left.val != root.val) {
        	return false;
        }
        
        if(root.right != null && root.right.val == root.val) {
        	isUnivalForTheCurrentNode = true;
        }
        
        else if(root.right != null && root.right.val != root.val) {
        	return false;
        }
        
        return isUnivalTree(root.left) &&  isUnivalTree(root.left) &&  isUnivalTree(root.right);
        
    }
}
