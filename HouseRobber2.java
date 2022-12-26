import java.util.*;

public class HouseRobber2 {

    //Recursion [ Time limit exceeded ]
    public int robRecursion(int[] nums) {

        int[] arr1 = Arrays.copyOfRange(nums,0,nums.length-1);
        int[] arr2 = Arrays.copyOfRange(nums,1, nums.length);
        return Math.max( robRecursion(arr1, arr1.length - 1), robRecursion(arr2, arr2.length - 1) );
    }

    private int robRecursion(int[] nums, int n) {
        if (n < 0) {
            return 0;
        }
        return Math.max(robRecursion(nums, n - 2) + nums[n], (robRecursion(nums, n - 1)));
    }

    //Memoization [ Time limit exceeded ]
    int[] memo;
    public int robMem(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int[] arr1 = Arrays.copyOfRange(nums,0,nums.length-1);
        int[] arr2 = Arrays.copyOfRange(nums,1, nums.length);
        return Math.max( robMem(arr1, arr1.length - 1), robMem(arr2, arr2.length - 1) );
    }

    private int robMem(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] >= 0) {
            return memo[i];

        }
        else{
            memo[i] = Math.max(robMem(nums, i - 2) + nums[i], robMem(nums, i - 1));
            int result = memo[i];
            Arrays.fill(memo, -1);
            return result;
        }

    }

    public int robDP(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
       int[] arr1 = Arrays.copyOfRange(nums,0,nums.length-1);
        int[] arr2 = Arrays.copyOfRange(nums,1, nums.length);
        return Math.max( calculateDP(arr1), calculateDP(arr2) );
    }

    private int calculateDP(int[] nums){
        if (nums.length == 0)
            return 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }
        return dp[nums.length];

    }



    public static void main(String[] args) {
        HouseRobber2 robber = new HouseRobber2();
        int[] nums = {1,2,3};
        robber.robMem(nums);

    }

}
