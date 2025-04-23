class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; //initialize maxProfit to 0
        int minPrice = Integer.MAX_VALUE; //initialize minPrice to largest integer value (2.14b) 
        
        for (int price : prices){ //iterate over prices array

            if (price < minPrice) { //check if current price is less than minPrice
                minPrice = price; // if so, reassign minPrice to current price
            }
            else if (price - minPrice > maxProfit) { //check if price - minPrice > maxProfit
                maxProfit = price - minPrice; //if so, reassign maxProfit
            }
        }
        return maxProfit;
    }
}






//         int profit = 0;

// //iterate over each price in prices array
//         for (int i = 0; i < prices.length - 1; i++){
// //iterate over inner loop that starts to the right of i
//             for (int j = i + 1; j < prices.length; j++){ //keep condition to j < prices.length since prices.length -1 will make it prices.length - 2 because of outer loop
//                 if (prices[j] - prices[i] > profit){
//                     profit = prices[j] - prices[i];
//                 }
//             }
//         }
//         return profit;