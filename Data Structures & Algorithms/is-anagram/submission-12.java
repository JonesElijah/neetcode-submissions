class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();

        if (s.length() != t.length()) return false;

        for(char charS : s.toCharArray()){
            mapS.put(charS, mapS.getOrDefault(charS,0)+1);
        }

        for(int i = 0; i < t.length(); i++){
            if(mapS.containsKey(t.charAt(i)) && mapS.get(t.charAt(i))>0){
                mapS.put(t.charAt(i), mapS.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }

        return true;
    }

}