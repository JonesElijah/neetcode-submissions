class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window 
        int l = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            max = Math.max(max, r-l+1);
            set.add(s.charAt(r));
        }
        return max;
    }
}
