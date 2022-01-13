
public class MaximumLengthOfSubArrayForPositiveProduct {

public int getMaxLen(int[] nums) {
	
	int positive = 0, negative = 0, maxPositive = 0;
	 for(int number:nums) {
		 
		 if(number == 0) {
			 positive = 0;
			 negative  = 0;
		 }
		 
		 else if( number > 0) {
			 positive++;
			 if(negative == 0) {
				 negative = 0;
			 }
			 else {
				 negative++;
			 }
		 }
		 else {
			 int temp = positive;
			 if(negative == 0) {
				 negative = 0;
			 }
			 else {
				 negative++;
			 }
			 
			 positive = negative;
			 negative = temp+1;
		 }
		 
		 maxPositive = Math.max(maxPositive, positive);
	 }
	 
	 return maxPositive;
        
    }

}
