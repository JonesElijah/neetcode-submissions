class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
                       // 3. Maintain the sliding window size of k
            // If the set size exceeds k, remove the oldest element (at index r - k)
            if (r-l > k) {
                set.remove(nums[l]);
                l++;
            }
            // 1. If the current number is already in the set, a duplicate within distance k is found
            if (set.contains(nums[r])) {
                return true;
            }
            
            // 2. Add the current number to the set
            set.add(nums[r]);
            

        }
        
        return false;
    }
}
