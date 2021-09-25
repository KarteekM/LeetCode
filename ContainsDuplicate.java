import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {

		Map<Integer, Integer> numbersWithOccurenceCount = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {			
			if(numbersWithOccurenceCount.get(nums[i]) == null)
				numbersWithOccurenceCount.put(nums[i], 1);
			else {
				return true;
			}
		}
		

		return false;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,1};
		System.out.println(new ContainsDuplicate().containsDuplicate(nums));
		
		int nums2[] = {1,2,3,4};
		System.out.println(new ContainsDuplicate().containsDuplicate(nums2));
		
		int nums3[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(new ContainsDuplicate().containsDuplicate(nums3));
	}

}
