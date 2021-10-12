
public class MaximumSubArray {
	public int maxSubArray(int[] nums) {

		int maxEndingHere = nums[0];
		int maxSoFar = nums[0];

		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i] > maxEndingHere + nums[i]) {
				maxEndingHere = nums[i];
			}
			else {
				maxEndingHere = maxEndingHere + nums[i];
			}
			if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
			}
		}

		return maxSoFar;
	}
	
	public static void main(String[] args) {
		int input1[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new MaximumSubArray().maxSubArray(input1));
	}

}
