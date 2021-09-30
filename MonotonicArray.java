
public class MonotonicArray {
	public boolean isMonotonic(int[] nums) {
		
		if(nums.length == 1)
            return true;


		int answer1 = 0;
		int answer2 = 0;

		if (nums.length > 1) {
			if (nums[0] <= nums[1]) {
				answer1 = 1;
			} 
			if(nums[0] >= nums[1]) {
				answer2 = -1;
			}

		}
		for (int i = 1, j = 2; j < nums.length; i++, j++) {

			if (nums[i] <= nums[j]) {
				answer1 = answer1 + 1;
			}
			if (nums[i] >= nums[j]) {
				answer2 = answer2 - 1;
			}
		}

		if (answer1 == nums.length - 1 || answer2 == -(nums.length - 1)) {
			return true;
		}

		return false;
	}

	public boolean isMonotonic2(int[] nums) {
		
		if(1 == nums.length)
			return true;

		boolean increasingOrder = true;
		boolean decreasingOrder = true;

		for (int i = 1; i < nums.length; i++) {

			increasingOrder = increasingOrder & (nums[i - 1] <= nums[i]);
			decreasingOrder = decreasingOrder & (nums[i - 1] >= nums[i]);

		}

		return increasingOrder || decreasingOrder;

	}
	
	public static void main(String[] args) {
		int nums6[] = { 1, 1, 0 };
		System.out.println(new MonotonicArray().isMonotonic(nums6)); // true
		int nums[] = { 1, 2, 2, 3 };
		System.out.println(new MonotonicArray().isMonotonic(nums)); // true
		int nums2[] = { 6, 5, 4, 4 };
		System.out.println(new MonotonicArray().isMonotonic(nums2)); // true
		int nums3[] = { 1, 3, 2 };
		System.out.println(new MonotonicArray().isMonotonic(nums3)); // false
		int nums4[] = { 1, 2, 4, 5 };
		System.out.println(new MonotonicArray().isMonotonic(nums4)); // true
		int nums5[] = { 1, 1, 1 };
		System.out.println(new MonotonicArray().isMonotonic(nums5)); // true

	}

}
