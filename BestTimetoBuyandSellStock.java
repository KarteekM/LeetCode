
public class BestTimetoBuyandSellStock {
	

	public int maxProfit(int[] prices) {

		if (prices.length <= 1) {
			return 0;
		}

		int profit = 0;
		int min = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > min) {
				if (profit < (prices[i] - min)) {
					profit = prices[i] - min;
				}
			}
			
			else {
				min = prices[i];
			}
			
		}
		return profit;
	}

	public static void main(String[] args) {

		/*
		 * int input1 [] = {7,1,5,3,6,4}; System.out.println(new
		 * SumOfTwoIntegers().maxProfit(input1)); int input2 [] = {7,6,4,3,1};
		 * System.out.println(new SumOfTwoIntegers().maxProfit(input2));
		 * 
		 * 
		 * int input3 [] = {2,4,1}; System.out.println(new
		 * SumOfTwoIntegers().maxProfit(input3));
		 */
		int input4[] = { 2, 1, 2, 1, 0, 1, 2 };

		System.out.println(new BestTimetoBuyandSellStock().maxProfit(input4));

	}

}
