import java.util.Stack;

public class Pattern132 {

	public boolean find132pattern(int[] nums) {

		Stack<Integer> stack = new Stack<Integer>();
		int s3 = Integer.MIN_VALUE;
		for (int i = nums.length - 1; i >= 0; i--) {

			if (nums[i] < s3) {
				return true;
			} else {
				while (!stack.isEmpty() && nums[i] > stack.peek()) {
					s3 = stack.pop();
				}
				stack.push(nums[i]);
			}

		}
		return false;
	}

}
