class Solution {
    public int removeDuplicates(int[] nums) {
        //two pointer
        int l = 0, r = l;
        //while l < r
        while(r < nums.length){
            if(nums[l] == nums[r]){
                r++;
            }
            else{
               l++;
               nums[l] = nums[r];
            }

        }
        return l+1;
    }
}