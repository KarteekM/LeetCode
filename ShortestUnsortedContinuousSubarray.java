
public class ShortestUnsortedContinuousSubarray {

	public int findUnsortedSubarray(int[] nums) {

		if (nums.length <= 1) {
			return 0;
		}

		int start = 0;
		int end = -1;
		int max = nums[0];

		for(int i=1;i<nums.length;i++) {
			if(max > nums[i]) {
				end = i;
			}
			else {
				max = nums[i];
			}
		}
		
		int min = nums[nums.length-1];
		for(int j=nums.length-2;j>=0;j--) {
			if(min < nums[j]) {
				start = j;
			}
			else {
				min = nums[j];
			}
		}
		
		return end - start + 1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,6,4,8,10,9,15};
		System.out.println(new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(arr));
	}
}
