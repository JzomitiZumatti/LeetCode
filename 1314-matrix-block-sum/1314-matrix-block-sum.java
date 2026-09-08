class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] ans = new int[mat.length][mat[0].length];
        int[][] prefSum = new int[mat.length][mat[0].length];
        int[][] ds = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j > 0) prefSum[i][j] = mat[i][j] + prefSum[i][j - 1];
                else prefSum[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < prefSum.length; i++) {
            for (int j = 0; j < prefSum[i].length; j++) {
                if (i == 0) ds[i][j] = prefSum[i][j];
                else ds[i][j] = prefSum[i][j] + ds[i - 1][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int rMin = Math.max(i - k, 0);
                int rMax = i + k < mat.length ? i + k : mat.length - 1;
                int cMin = Math.max(j - k, 0);
                int cMax = j + k < mat[i].length ? j + k : mat[i].length - 1;
                int sum = ds[rMax][cMax]
                        - (rMin > 0 ? ds[rMin - 1][cMax] : 0)
                        - (cMin > 0 ? ds[rMax][cMin - 1] : 0)
                        + (rMin > 0 && cMin > 0 ? ds[rMin - 1][cMin - 1] : 0);
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}