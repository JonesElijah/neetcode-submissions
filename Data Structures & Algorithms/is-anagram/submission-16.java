class Solution {
    public boolean isAnagram(String s, String t) {
        //base case, if s and t 0 return true
        if(s.length() == 0 && t.length() == 0) return true;
        //base case, if length doesnt equal return false
        if(s.length()!=t.length()) return false;
        //double hashmap
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        //loop thru both strings and add letter and #freq
        for(char charS : s.toCharArray()){
            mapS.put(charS, mapS.getOrDefault(charS, 0)+1);
        }

        for(char charT : t.toCharArray()){
            mapT.put(charT, mapT.getOrDefault(charT, 0)+1);
        }
        //loop thru s, if s in mapT, - 0
        for(int i = 0; i < s.length(); i++){
            if(mapT.containsKey(s.charAt(i)) && mapT.get(s.charAt(i)) > 0){
                mapT.put(s.charAt(i), mapT.get(s.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        //false
        return true;
    }
}