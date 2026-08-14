class Solution {
    public boolean hasDuplicate(int[] nums) {
        //create map
        HashSet<Integer> set = new HashSet<>();
        //loop thru array
        //if exist in array, true. Else false 
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
        
    }
}