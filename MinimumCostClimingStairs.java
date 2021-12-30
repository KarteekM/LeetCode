
public class MinimumCostClimingStairs {

	public int minCostClimbingStairs(int[] cost) {

		int length = cost.length;
		int dp[] = new int[length];

		for (int i = 0; i < cost.length; i++) {
			if (i < 2) {
				dp[i] = cost[i];
			}
			else {
				dp[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
			}
		}
		
		return Math.min(dp[length-1], dp[length-2]);

	}

}
