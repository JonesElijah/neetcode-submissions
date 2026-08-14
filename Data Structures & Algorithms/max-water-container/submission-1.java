class Solution {
    public int maxArea(int[] heights) {
       int leftP = 0;
       int rightP = heights.length - 1;
       int res = 0;
       while (leftP < rightP){
        int container = (rightP - leftP) * Math.min(heights[leftP], heights[rightP]);
         res = Math.max(container, res);
        if(heights[leftP] < heights[rightP]){
            leftP++;
        }
        else{
            rightP--;
        }
       } 
        return res;
    }
}
