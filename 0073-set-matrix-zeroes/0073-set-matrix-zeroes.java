class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean[][] isZero = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < r; k++) {
                        isZero[k][j] = true;
                    }
                    for (int k = 0; k < c; k++) {
                        isZero[i][k] = true;
                    }
                }
            }
        }
        for (int i = 0; i < isZero.length; i++) {
            for (int j = 0; j < isZero[i].length; j++) {
                if (isZero[i][j]) matrix[i][j] = 0;
            }
        }
    }
}