
public class SumRootOfLeafNumbers {
	 public int sumNumbers(TreeNode root) {
		 
		   return sumNumbersUtility(root, 0);
	  
	    }

	private int sumNumbersUtility(TreeNode root, int currValue) {
	      
        if(null == root) {
        	return 0;
        }
        if(root.left == null && root.right == null) {
        	return currValue;
        }
        currValue =  (currValue*10) + root.val;
        return sumNumbersUtility(root.left, currValue) + sumNumbersUtility(root.right, currValue);
        
	}

}
