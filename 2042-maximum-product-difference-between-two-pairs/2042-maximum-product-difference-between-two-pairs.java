class Solution {
    public int maxProductDifference(int[] nums) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : nums) {
            minPq.add(n);
            maxPq.add(n);
        }

        int min = 1;
        int max = 1;
        int counter = 0;
        while (counter < 2) {
            min *= minPq.poll();
            max *= maxPq.poll();
            counter++;
        }

        return max - min;
    }
}