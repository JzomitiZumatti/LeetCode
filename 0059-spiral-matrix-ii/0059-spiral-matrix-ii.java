class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int k = 1;
        int rowTop = 0;
        int rowBot = n - 1;
        int colLeft = 0;
        int colRight = n - 1;
        while (rowTop <= rowBot) {
            for (int j = colLeft; j <= colRight; j++) {
                ans[rowTop][j] = k;
                k++;
            }
            rowTop++;
            for (int i = rowTop; i <= rowBot; i++) {
                ans[i][colRight] = k;
                k++;
            }
            colRight--;
            for (int j = colRight; j >= colLeft; j--) {
                ans[rowBot][j] = k;
                k++;
            }
            rowBot--;
            for (int i = rowBot; i >= rowTop; i--) {
                ans[i][colLeft] = k;
                k++;
            }
            colLeft++;
        }
        return ans;
    }
}