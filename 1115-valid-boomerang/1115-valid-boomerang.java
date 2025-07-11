class Solution {
    public boolean isBoomerang(int[][] points) {
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < points.length; i++) {
            x[i] = points[i][0];
            y[i] = points[i][1];
        }
        double s = 0.5 * Math.abs(x[0] * (y[1] - y[2]) + x[1] * (y[2] - y[0]) + x[2] * (y[0] - y[1]));
        return s != 0;
    }
}