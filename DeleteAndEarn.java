
public class DeleteAndEarn {

	public int deleteAndEarn(int[] nums) {

		int sumOfEachNumber[] = new int[10001];

		for (int num : nums) {
			sumOfEachNumber[nums[num]] = sumOfEachNumber[nums[num]] + num;
		}

		int dp[] = new int[10000];

		dp[1] = sumOfEachNumber[1];

		for (int i = 2; i < sumOfEachNumber.length; i++) {
			dp[i] = Math.max(dp[i - 2] + sumOfEachNumber[i], dp[i - 1]);
		}

		return dp[10000];

	}
}
