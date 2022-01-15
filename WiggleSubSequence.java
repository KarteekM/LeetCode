
public class WiggleSubSequence {

	public int wiggleMaxLength(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int previousDifference = 0;
		int result = 1;

		for (int index = 1; index < nums.length; index++) {
			int difference = nums[index] - nums[index - 1];
			if ( (difference > 0 && previousDifference <= 0) ) {
				result++;
				previousDifference = difference;
			} 
			else if((difference < 0 && previousDifference >= 0)) {
				result ++ ;
				previousDifference = difference;
				
			}
		}

		return result;
	}

}
