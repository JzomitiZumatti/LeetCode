class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat[0].length;
        k = k % m;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    if (mat[i][j] != mat[i][(j + k) % m]) return false;
                } else {
                    if (mat[i][j] != mat[i][(j - k + m) % m]) return false;
                }
            }
        }
        return true;
    }
}