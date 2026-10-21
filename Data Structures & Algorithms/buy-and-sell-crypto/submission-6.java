class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 0, max = 0;
        while(r < prices.length){
            if(prices[l] >= prices[r]){
                l=r;
                r++;
            }
            else{
                max = Math.max(max, prices[r]-prices[l]);
                r++;
            }
        }
        return max;
    }
}
