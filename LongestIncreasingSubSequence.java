

public class LongestIncreasingSubSequence {
	
	  public int lengthOfLIS(int[] nums) {
		  
		  if (nums == null | nums.length == 0)
				return 0;
	        
		  int numsLength = nums.length;
		  int increasingSequence[] =new int[numsLength];
		  int lengthOfIncreasingSequence = 0;
		  increasingSequence[lengthOfIncreasingSequence++] = nums[0];
		  
		  for(int i=1;i<numsLength;i++) {
			  
			  if(nums[i] > increasingSequence[lengthOfIncreasingSequence - 1]) {
				  increasingSequence[lengthOfIncreasingSequence++] = nums[i];
			  }
			  else {
				  
				  int positionToPlaceTheNumber = findPosition(increasingSequence,0,lengthOfIncreasingSequence-1,nums[i]);
				  increasingSequence[positionToPlaceTheNumber] = nums[i];
			  }
			  
		  }
		  return lengthOfIncreasingSequence;
	    }

	private int findPosition(int[] increasingSequence, int low, int high, int numberToFind) {
		
		while(low <= high) {
			
			int mid = low + (high - low)/2;
			if(increasingSequence[mid] == numberToFind) {
				return mid;
			}
			else if(increasingSequence[mid] < numberToFind) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return low;
	}
	
	
}
