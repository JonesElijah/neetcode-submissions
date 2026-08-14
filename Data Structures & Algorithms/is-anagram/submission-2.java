class Solution {
    public boolean isAnagram(String s, String t) {
        //base case 
        if(s.length() != t.length()){
            return false;
        }
        //hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        //iterate s on hashmap, with char = key, # of char = val
        for(char charS : s.toCharArray()){
            map.put(charS, map.getOrDefault(charS, 0)+1);
        }
        //iterate t, if t char !exist or char.val <= 0, return false, else finish & return true
        for(int i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) < 0){
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i))-1);
        }

        for(char charS : s.toCharArray()){
            if (map.get(charS) != 0){
                return false;
            }
        }
        return true; 
    }
}
