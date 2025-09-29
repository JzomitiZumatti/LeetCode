class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        for (int num : nums) {
            pq1.add(num);
        }
        int counter = 0;
        int res = -1;
        while (!pq1.isEmpty()) {
            if (counter == nums.length - k) {
                res = pq1.poll();
            }
            pq1.poll();
            counter++;
        }
        return res;
    }
}