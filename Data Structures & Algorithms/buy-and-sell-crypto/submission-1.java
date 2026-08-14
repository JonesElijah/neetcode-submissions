class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int counter = 0, result = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                counter = Math.abs(prices[r] - prices[l]);
                result = Math.max(counter, result);
            }
            else{
                l=r;
            }
            r++;

        }
        return result;
    }
}
