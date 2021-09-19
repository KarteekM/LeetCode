
public class MissingNumber {
public int missingNumber(int[] nums) {
    
	 int largestNumber = nums.length;
	 int sumOfConsecutiveNumbers = (largestNumber * (largestNumber + 1))/2;
	 int sumOfConsecutiveNumbersHavingMissingElement = 0 ;
	 for(int i=0;i<nums.length;i++) {
		 sumOfConsecutiveNumbersHavingMissingElement = sumOfConsecutiveNumbersHavingMissingElement + nums[i];
	 }
	 int missingNumber = sumOfConsecutiveNumbers - sumOfConsecutiveNumbersHavingMissingElement;
     return missingNumber;   
    }

public static void main(String[] args) {
	int numbersInSequence[] = {3,0,1};
	System.out.println(new MissingNumber().missingNumber(numbersInSequence));
	
	int numbersInSequence2[] = {0,1};
	System.out.println(new MissingNumber().missingNumber(numbersInSequence2));
	
	int numbersInSequence3[] = {9,6,4,2,3,5,7,0,1};
	System.out.println(new MissingNumber().missingNumber(numbersInSequence3));
	
	int numbersInSequence4[] = {0};
	System.out.println(new MissingNumber().missingNumber(numbersInSequence4));
	
}

}
