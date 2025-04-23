class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++){
        //start i at 1 because we're comparing it to the previous day (and we can't do that starting at 0)
        //iterate i up to prices.length because prices[i-1] = prices[prices.length - 1] which is the last index in prices
            if (prices[i] > prices[i-1]){ //if there is a profit
                totalProfit += prices[i] - prices[i-1]; //add it to the total profit
            }
        }
        return totalProfit;
    }
}