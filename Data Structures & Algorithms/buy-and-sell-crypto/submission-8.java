class Solution {
    public int maxProfit(int[] prices) {
        // sliding window
        int l = 0, max = 0;

        for(int r = 0; r < prices.length; r++) {
            if (prices[r] < prices[l]) {
                l = r;
            }
            max = Math.max(max, prices[r] - prices[l]);
        }
        return max;
    }
}
