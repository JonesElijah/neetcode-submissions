class Solution {
    public boolean hasDuplicate(int[] nums) {
        //base case if empty
        if(nums == null || nums.length == 0){
            return false;
        }
        //Create HashSet
        HashSet<Integer> set = new HashSet<>();
        //iterate thru array 
        //if exist, return true, else add
        //return false

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;

    }
}