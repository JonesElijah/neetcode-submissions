class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //HashMap - count and nums
        HashMap<Integer, Integer> map = new HashMap<>();
        //Create List 
        ArrayList<Integer>[] freq = new ArrayList[nums.length+1];
        //iterate thru freq to add list
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        //
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        
        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                res[index++] = n;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
