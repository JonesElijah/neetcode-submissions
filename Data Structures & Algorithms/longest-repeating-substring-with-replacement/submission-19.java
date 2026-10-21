class Solution {
    public int characterReplacement(String s, int k) {
        //HashMap to store 
        HashMap<Character, Integer> map = new HashMap<>();
        
        //results
        int res = 0;
        //sliding window l & r and max freq
        int l = 0, r = 0, maxf = 0;

        //iterate thru string 
        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            maxf = map.values().stream().max(Integer::compareTo).orElse(0);

            if((r-l+1) - maxf > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}
