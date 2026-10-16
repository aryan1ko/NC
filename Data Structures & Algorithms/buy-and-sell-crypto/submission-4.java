class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int diff = 0;
        for(int r = 0; r < prices.length; r++) {
            if(prices[r] < prices[l]) {
                l = r;
            }
            else {
                if(prices[r] - prices[l] > diff) {
                    diff = prices[r] - prices[l];
                }
            }
        }
        return diff;
    }
}