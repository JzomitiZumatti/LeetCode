class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int counter = 0;
        int[] xy = {points[0][0], points[0][1]};
        for (int i = 1; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int max = Math.max(Math.abs(xy[0] - x), Math.abs(xy[1] - y));
            xy[0] += x - xy[0];
            xy[1] += y - xy[1];
            counter += max;
        }
        return counter;
    }
}