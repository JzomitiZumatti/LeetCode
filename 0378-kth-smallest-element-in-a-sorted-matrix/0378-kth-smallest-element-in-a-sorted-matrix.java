class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int[] m : matrix) {
            for (int n : m) {
                priorityQueue.add(n);
            }
        }
        int ans = 0;
        int i = 0;
        while (i < k && !priorityQueue.isEmpty()) {
            ans = priorityQueue.poll();
            i++;
        }
        return ans;
    }
}