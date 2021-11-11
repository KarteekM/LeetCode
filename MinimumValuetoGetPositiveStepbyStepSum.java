
public class MinimumValuetoGetPositiveStepbyStepSum {

	public MinimumValuetoGetPositiveStepbyStepSum() {
	}

	 public int minStartValue(int[] nums) {
		 
		 int minSum = Integer.MAX_VALUE;
		 int sum = 0;
		 
		 for(int n:nums) {
			 sum = sum + n;
			 minSum = Math.min(sum, minSum);
		 }
		 
		 if(minSum > 0) { //for [1,2...]
			 return 1;
		 }
		 
		 //Should never be less than 1
		 // which means  minSum + x = 1
		 //i.e. x = 1 - minSum
		 return 1 - minSum;
	    }
}
