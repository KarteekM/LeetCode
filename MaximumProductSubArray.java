
public class MaximumProductSubArray {
	public int maxProduct(int[] nums) {
		
		int lengthOfArray = nums.length;
		if(lengthOfArray == 1) {
			return nums[0];
		}
		int leftFlow = 1;
		int rightFlow = 1;
		int answer = 0;
		for(int i=0;i<lengthOfArray;i++) {
			
			if(leftFlow == 0) {
				leftFlow = 1;
			}
			if(rightFlow == 0) {
				rightFlow = 1;
			}
			
		   leftFlow = leftFlow * nums[i];
		   rightFlow = rightFlow * nums[lengthOfArray-1-i];
		   int temp = Math.max(leftFlow, rightFlow);
		   answer = Math.max(answer, temp);
		}
		return answer;
		
	}

	public static void main(String[] args) {
		
		int nums[] = {2,3,-2,4};
		System.out.println(new MaximumProductSubArray().maxProduct(nums));
		
		int nums2[] = {-2,0,-1};
		System.out.println(new MaximumProductSubArray().maxProduct(nums2));
		
	}
}
