class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int count = 0;
        while (l < r) {
            count = numbers[l] + numbers[r];
            if(count == target){
                return new int[]{l+1, r+1};
            }
            if (count > target){
                r--;
            }
            
            if (count < target){
                l++;
            }
        }
        return new int []{};
    }
}
