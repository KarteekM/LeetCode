import java.util.*;
import java.util.HashSet;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<=nums.length-3;i++){
            int j = i+1;
            int k = nums.length-1;
            int sum;

            while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return new ArrayList<>(set);
    }
}
