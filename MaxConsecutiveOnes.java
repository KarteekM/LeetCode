
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {

		int maxSum = 0;
		int currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (maxSum < currentSum) {
					maxSum = currentSum;
				}
				currentSum = 0;
			} else {
				++currentSum;
			}
		}
		
		if (maxSum < currentSum) {
			maxSum = currentSum;
		}
		
		return maxSum;
	}

	public static void main(String[] args) {	
		 int nums[] = {1,1,0,1,1,1};
		 System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
		 
		 int nums2[] = {1,0,1,1,0,1};
		 System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums2));

	}

}
