class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i : piles){
            max = Math.max(max, i);
        }
        int l = 1, r = max, res = r;

        while(l<=r){
            int mid = l + (r-l)/2;
            double sum = 0;
            for(int i : piles){
                sum += Math.ceil((double) i/mid);
            }
            if(sum <= h){
                res = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return res;
    }
}


