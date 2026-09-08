class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //two pointer
        int l = 0, r = numbers.length - 1;
        int sum;
        //while 
        while(l < r){
            sum = numbers[l] + numbers[r];
            if(sum > target){
                r--;
            }
            else if(sum < target){
                l++;
            }
            else{
                return new int[]{l+1, r+1};
            }
        }
            return new int[]{l+1, r+1};
    }
}
