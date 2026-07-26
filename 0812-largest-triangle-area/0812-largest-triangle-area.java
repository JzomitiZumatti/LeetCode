class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = 0.00;
        for (int i = 0; i < points.length - 2; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = 0; j < points.length - 1; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                for (int k = 0; k < points.length; k++) {
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    double area = (double) (Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))) / 2;
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
}