class Solution {
    public int numSpecial(int[][] mat) {
        int counter = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    counter += checker(i, j, mat);
                }
            }
        }
        return counter;
    }

    private static int checker(int raw, int col, int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i != raw && mat[i][col] == 1) return 0;
        }
        for (int i = 0; i < mat[0].length; i++) {
            if (i != col && mat[raw][i] == 1) return 0;
        }
        return 1;
    }
}