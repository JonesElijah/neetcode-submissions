class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap - String and ListString
        HashMap<String, List<String>> map = new HashMap<>();
        //char array & add to map
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        //loop thru strs
        //if strs match key add to list
        //else create list
        //return
    }
}
