class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftP = 0;
        int rightP = numbers.length - 1;

            while (leftP < rightP){
                int sum = numbers[leftP] + numbers[rightP];
                if(sum == target){
                    return new int[]{leftP+1, rightP+1};
                }
                else if (sum < target){
                    leftP++;
                }
                else if (sum > target){
                    rightP--;
                }
            }
        return new int[]{};
    }
}
