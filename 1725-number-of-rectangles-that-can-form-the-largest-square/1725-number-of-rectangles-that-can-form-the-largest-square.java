class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            if (max < min) {
                ans = 1;
                max = Math.max(max, min);
            }
            else if (max == min) ans++;
        }
        return ans;
    }
}