package lc_best_time_bus_sell_stock_121;

public class Solution {
	public static void main(String[] args) {
		int[] input = new int[] { 7, 1, 4, 2, 4, 5, 8 };
		System.out.println(maxProfit(input));
	}

	private static int maxProfit(int[] prices) {
		int i = 0;
		int j = 1;
		int profit = 0;
		while (j < prices.length) {
			if (prices[i] > prices[j]) {
				i = j;
				++j;
				continue;
			} else {
				if (prices[j] - prices[i] > profit) {
					profit = prices[j] - prices[i];
				}
				++j;
			}
		}
		return profit;
	}
}
