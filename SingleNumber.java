import java.util.Arrays;
import java.util.HashMap;


public class SingleNumber {
    public int singleNumber(int[] nums) {
    	
    	HashMap<Integer, Integer> numberCount = new HashMap<Integer, Integer>();
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		if(numberCount.get(nums[i]) == null) {
    			numberCount.put(nums[i], 1);
    		}
    		
    		else {
    			int count = (Integer)numberCount.get(nums[1]);
    			numberCount.put(nums[i], ++count);
    		}
    	}
    	
    	return numberCount.entrySet().stream().max( (entry1 , entry2 ) -> entry2.getValue() - entry1.getValue() ).get().getKey();
    }
    
    public static void main(String[] args) {
		
    	int  nums[] = {2,2,1};
    	System.out.println(new SingleNumber().singleNumber(nums));
    	
    	int  nums2[] = {4,1,2,1,2};
    	System.out.println(new SingleNumber().singleNumber(nums2));
	}

}
