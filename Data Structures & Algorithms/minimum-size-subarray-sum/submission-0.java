class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //sliding window
        int l = 0, counter = 0, min = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r++){
            counter = nums[r]+counter;
            while(counter >= target){
                min = Math.min(min, r-l+1);
                counter = (counter-nums[l]);
                l++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}