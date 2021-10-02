
public class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {

		int countDigits = 0;
		int numbersWithEvenNumberOfDigits = 0;
		for (int i = 0; i < nums.length; i++) {
			countDigits = countNumberOfDigits(nums[i]);
			if (countDigits % 2 == 0) {
				numbersWithEvenNumberOfDigits++;
			}

		}
		return numbersWithEvenNumberOfDigits;
	}

	private int countNumberOfDigits(int numberForWhichDigitsNeedToBeCounted) {

		int countDigits = 0;
		while (numberForWhichDigitsNeedToBeCounted > 0) {
			int digit = numberForWhichDigitsNeedToBeCounted % 10;
			numberForWhichDigitsNeedToBeCounted = numberForWhichDigitsNeedToBeCounted / 10;
			if (digit >  -1) {
				countDigits++;
			}
		}

		return countDigits;
	}

	public static void main(String[] args) {
		
		
		  int input1[] = {12,345,2,6,7896}; System.out.println(new
		  FindNumbersWithEvenNumberOfDigits().findNumbers(input1));
		  
		int input2[] = {555,901,482,1771};
		System.out.println(new FindNumbersWithEvenNumberOfDigits().findNumbers(input2));
		

	}

}
