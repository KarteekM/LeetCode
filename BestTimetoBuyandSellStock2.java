
public class BestTimetoBuyandSellStock2 {

	public int maxProfit(int[] prices) {

		if (prices.length <= 1) {
			return 0;
		}
		int profit = 0;

		int buy = 0, sell = 0, i = 0;
		int length = prices.length-1;

		while (i < length) {
			while (i < length && prices[i + 1] <= prices[i])
				i++;
			buy = prices[i];
			sell = buy;
			while (i < length && prices[i + 1] > prices[i])
				i++;
			sell = prices[i];
			profit = profit + (sell - buy);
		}
		
		return profit;
	}
	
	public int maxProfit2(int[] prices) {
		
		int profit = 0;
		if (prices.length <= 1) {
			return 0;
		}
		
		for(int i=1;i<prices.length;i++) {
			profit = profit + Math.max(0, prices[i] - prices[i-1]);
		}
		
		return profit;
		
	}
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(new BestTimetoBuyandSellStock2().maxProfit2(prices));
	}

}
