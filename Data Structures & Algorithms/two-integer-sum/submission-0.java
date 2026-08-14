//param: arr nums, target of nums return: indices i & j 
//[1,2,3,4], 7 -> [2,3] 
//i != j, not empty, always positive  

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create map
        HashMap<Integer, Integer> map = new HashMap<>();

        //iterate thru array target - nums
        for (int i = 0; i < nums.length; i++){
            //if !exist add nums/index to map, if exist return
            if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
