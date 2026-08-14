class Solution {
    public boolean hasDuplicate(int[] nums) {
        //hashmap
        HashSet<Integer> set = new HashSet<>();
        //loop thru nums
        for(int i  = 0; i < nums.length; i++){
        //if nums !exist add to map, else return true
        if(!(set.contains(nums[i]))){
            set.add(nums[i]);
        }
        else{
            return true;
        }
        }
        //return false
        return false;
   

    }
}