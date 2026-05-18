class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        else {
            int[][] ans = new int[r][c];
            int[] line = new int[r * c];
            int k = 0;
            for (int[] arr : mat) {
                for (int j : arr) {
                    line[k] = j;
                    k++;
                }
            }
            k = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = line[k];
                    k++;
                }
            }
            return ans;
        }
    }
}