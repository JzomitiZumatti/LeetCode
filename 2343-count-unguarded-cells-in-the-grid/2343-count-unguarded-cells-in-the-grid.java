class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int counter = 0;
        boolean[][] guardsSpecial = new boolean[m][n];
        boolean[][] wallsSpecial = new boolean[m][n];
        boolean[][] seeing = new boolean[m][n];

        for (int[] g : guards) guardsSpecial[g[0]][g[1]] = true;
        for (int[] w : walls)  wallsSpecial[w[0]][w[1]] = true;

        checkNeighbors(n, m, seeing, guardsSpecial, wallsSpecial);
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!guardsSpecial[i][j] && !wallsSpecial[i][j] && !seeing[i][j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void checkNeighbors(int n, int m, boolean[][] seeing, boolean[][] guardsSpecial, boolean[][] wallsSpecial) {
        for (int i = 0; i < m; i++) {
            for (int j = 0, see = 0; j < n; j++) {
                if (guardsSpecial[i][j]) see = 1;
                else if (wallsSpecial[i][j]) see = 0;
                else if (see == 1) seeing[i][j] = true;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = n-1, see = 0; j >= 0; j--) {
                if (guardsSpecial[i][j]) see = 1;
                else if (wallsSpecial[i][j]) see = 0;
                else if (see == 1) seeing[i][j] = true;
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0, see = 0; i < m; i++) {
                if (guardsSpecial[i][j]) see = 1;
                else if (wallsSpecial[i][j]) see = 0;
                else if (see == 1) seeing[i][j] = true;
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = m-1, see = 0; i >= 0; i--) {
                if (guardsSpecial[i][j]) see = 1;
                else if (wallsSpecial[i][j]) see = 0;
                else if (see == 1) seeing[i][j] = true;
            }
        }
    }
}