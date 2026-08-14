class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, count= 0;
        HashSet<Character> set = new HashSet<>();
        while(r < s.length()){
            if (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            else{
                set.add(s.charAt(r));
                count = Math.max(count, r-l +1);
                r++;
            }

        }
        return count;
    }
}
