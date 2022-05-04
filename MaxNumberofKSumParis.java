import java.util.Arrays;

public class MaxNumberofKSumParis {

	public int maxOperations(int[] nums, int k) {
		/* Way-1 - Works
		 * Map<Integer,Integer> numCount =new HashMap<Integer,Integer>(); int count = 0;
		 * for(int i=0;i<nums.length;i++) { int key = k - nums[i];
		 * if(numCount.containsKey(key)) { count++; if(numCount.get(key) == 1) {
		 * numCount.remove(key); } else { numCount.put(key, numCount.get(key)-1); }
		 * 
		 * } else { numCount.put(nums[i], numCount.getOrDefault(nums[i], 0) + 1); } }
		 * return count;
		 */
		
	// Way-2 works	
	  Arrays.sort(nums);
	  int start= 0;
	  int end= nums.length-1;
	  int count = 0;
	  
	  while(start < end) {
		 
		  int sum = nums[start] + nums[end];
		  
		  if(sum == k) {
			  count++;
			  start++;
			  end--;
		  }
		  
		  else if(sum < k) {
			  start++;
		  }
		  
		  else {
			  end--;
		  }
		  
	  }
	  
		return count;
	}
}
