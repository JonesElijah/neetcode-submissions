class Solution {
    public boolean hasDuplicate(int[] nums) {
        //base case: if nums is empty return falseale
        if(nums.length == 0) return false;
        //hashSet
        Set<Integer> set = new HashSet<>();
        //iterate thru nums
        for(int i = 0; i < nums.length; i++){
        //if nums[i] exist in map, return true
        //else, add nums[i] to set
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);            
        }
        //return false
        return false;

    }
}