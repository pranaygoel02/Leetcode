class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 0;
        int maxProfit = 0;
        int n = prices.length;
        while(++j < n) {
            int diff = prices[j] - prices[i];
            if(diff > 0) {
                maxProfit = Math.max(maxProfit, diff);
            }
            else {
                i = j;
            }
        }
        return maxProfit;
    }
}