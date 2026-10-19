class Solution{
    public int lengthOfLongestSubstring(String s){
        int l = 0, r = 0;
        int max=0, counter = 0;
        HashSet<Character> set = new HashSet<>();
        while(r < s.length()){
            if(set.contains(s.charAt(r))){
                counter=0;
                set.remove(s.charAt(l));
                l++;            }
            else{
                set.add(s.charAt(r));
                counter++;
                max= Math.max(max, r-l+1);
                r++;
            }
        }
        return max;
    }
}