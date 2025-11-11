class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        List<int[]> posZerosOnes = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            int zerosSum = 0;
            int onesSum = 0;
            for (int j = 0; j < strs[i].length(); j++) {
                if (Integer.parseInt(String.valueOf(strs[i].charAt(j))) == 0) zerosSum++;
                else onesSum++;
            }
            posZerosOnes.add(new int[]{zerosSum, onesSum});
        }

        int[][] dp = new int[m + 1][n + 1];

        for (int[] pair : posZerosOnes) {
            int zeros = pair[0];
            int ones = pair[1];
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
}