class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //sliding window
        int l = 0, matched = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int r = 0; r < s2.length(); r++){
            if(map.containsKey(s2.charAt(r))){
                map.put(s2.charAt(r), map.get(s2.charAt(r))-1);
                if(map.get(s2.charAt(r)) == 0){
                    matched++;
                }
            }
            if(r-l+1 > s1.length()){
                if(map.containsKey(s2.charAt(l))){
                    if(map.get(s2.charAt(l)) == 0){
                     matched--;   
                    }
                    map.put(s2.charAt(l), map.get(s2.charAt(l))+1);
                }
                l++;
            }
            if(matched == map.size()){
                return true;
            }
        }
        return false;
    }
}
