class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //List
        List<List<Integer>> list = new ArrayList<>();
        //sort
        Arrays.sort(nums);
        //while loop
        //for loop
        for(int i = 0; i < nums.length; i++){
        //two pointer
        int l = i+1, r = nums.length - 1;
            while(l < r){
        int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    if(list.contains(Arrays.asList(nums[i], nums[l], nums[r]))){
                    l++;
                    continue;
                    }
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                }

            }
        }
        return list;
    }
}
