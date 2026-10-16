class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int buyPrice = prices[0];
        int sellPrice = prices[0];
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            if(prices[i] - buyPrice > diff) {
                diff = prices[i] - buyPrice;
            }
            sellPrice = prices[i];
            
        }
        return diff;
    }
}