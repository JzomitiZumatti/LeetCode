class Solution {
    public int maxProductDifference(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : nums) {
            pq.add(n);
        }

        int min = 1;
        int max = 1;
        int counter = 0;
        int size = pq.size() - 2;
        while (!pq.isEmpty()) {
            if (counter <= 1) {
                min *= pq.poll();
            } else if (counter >= size) {
                max *= pq.poll();
            } else {
                pq.poll();
            }
            counter++;
        }

        return max - min;
    }
}