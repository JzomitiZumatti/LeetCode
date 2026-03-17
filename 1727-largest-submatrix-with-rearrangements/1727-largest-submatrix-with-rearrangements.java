class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int res = 0;
        int[][] heights = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) heights[i][j] += matrix[i][j];
                else if (matrix[i][j] == 1) heights[i][j] = heights[i - 1][j] + 1;
                else heights[i][j] = 0;
            }
        }
        for (int[] height : heights) {
            Arrays.sort(height);
            int j = 0;
            for (int i = height.length - 1; i >= 0; i--) {
                res = Math.max(res, height[i] * (j + 1));
                j++;
            }
        }
        return res;
    }
}