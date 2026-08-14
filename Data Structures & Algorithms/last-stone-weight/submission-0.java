class Solution {
    public int lastStoneWeight(int[] stones) {
      if(stones == null) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      for(int s : stones){
        minHeap.add(-s);
      }

      while(minHeap.size() > 1){
        int first = minHeap.poll();
        int second = minHeap.poll();

        if (second > first){
            minHeap.add(first - second);
        }
      }

        minHeap.add(0);
        return Math.abs(minHeap.peek());
    }
}
