class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //base
        if(s2.length() < s1.length()){
            return false;
        }
        //sliding window
        int l = 0, r = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        while(r < s2.length()){
            while(r-l+1 > s1.length()){
                if(map.containsKey(s2.charAt(l))){
                    if(map.get(s2.charAt(l))==0){
                        count--;
                    }
                    map.put(s2.charAt(l), map.get(s2.charAt(l))+1);
                }
                l++;
            }
            if(map.containsKey(s2.charAt(r))){
                map.put(s2.charAt(r), map.get(s2.charAt(r))-1);
                if(map.get(s2.charAt(r)) == 0){
                    count++;
                }
            }
            if(count == map.size()){
                return true;
            }
            r++;
        }
        return false;
    }
}