
public class MaximumBinaryTree {

	 public TreeNode constructMaximumBinaryTree(int[] nums) {
	        
		 int start = 0;
		 int end = nums.length -1 ;
		 return helper(nums,start,end);
	    }

	private TreeNode helper(int[] nums, int start, int end) {
		
		if(start > end) {
			return null;
		}
		
		int indexOfMaxNumber = start;
		for(int i=start;i<=end;i++) {
			if(nums[i] > nums[start]) {
				indexOfMaxNumber = i;
			}
		}
		
		TreeNode root = new TreeNode(nums[indexOfMaxNumber]);
		root.left = helper(nums,start,indexOfMaxNumber-1);
		root.right = helper(nums,indexOfMaxNumber+1,end);
		return root;
		
	}
}
