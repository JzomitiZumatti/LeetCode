class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (isEquals(mat, target)) return true;
        if (isEquals(rotate_90(mat), target)) return true;
        if (isEquals(rotate_180(mat), target)) return true;
        return isEquals(rotate_270(mat), target);
    }

    private static int[][] rotate_90(int[][] matrix) {
        int[][] test = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                test[i][j] = matrix[j][matrix.length - i - 1];
            }
        }
        return test;
    }

    private static int[][] rotate_180(int[][] matrix) {
        int[][] test = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                test[i][j] = matrix[matrix.length - i - 1][matrix.length - j - 1];
            }
        }
        return test;
    }

    private static int[][] rotate_270(int[][] matrix) {
        int[][] test = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                test[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return test;
    }

    private static boolean isEquals(int[][] matrix, int[][] target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}