class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap
        HashMap<String, List<String>> list = new HashMap<>();
        //for loop
        for(String s : strs){
            int[] count  = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            list.putIfAbsent(key, new ArrayList<>());
            list.get(key).add(s);
        }
        return new ArrayList<>(list.values());

    }
}
