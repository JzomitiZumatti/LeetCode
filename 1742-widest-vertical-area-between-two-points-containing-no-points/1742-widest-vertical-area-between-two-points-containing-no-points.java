class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] point : points) {
            pq.add(point[0]);
        }

        int maxWidth = Integer.MIN_VALUE;
        int counter = 0;
        while (counter < points.length - 1) {
            int temp = pq.poll();
            maxWidth = Math.max(maxWidth, Math.abs(temp - pq.peek()));
            counter++;
        }
        return maxWidth;
    }
}