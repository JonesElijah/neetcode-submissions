class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap
        //iterate thru loop
        //target - nums, if exist return indexes
        //else, continue

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                return new int []{map.get(sum), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int []{};
    }
}
