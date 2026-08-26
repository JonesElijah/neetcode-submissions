class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //HashMap count
        HashMap<Integer, Integer> count = new HashMap<>();
        //init map
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        //List
        List<Integer>[] list = new ArrayList[nums.length +1];
        //init list 
        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }
        //place count in list
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }
        //iterate thru list
        int index = 0;
        int[] result = new int[k];
        for(int i = list.length -1; i > 0 && index < k; i--){
            for(int n : list[i]){
                result[index++] = n;
                if(index ==k){
                    return result;
                }
            }
        }
        return result;
    }
}
