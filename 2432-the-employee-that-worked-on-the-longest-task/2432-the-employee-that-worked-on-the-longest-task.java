class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int[] unitOfTimesNeeded = new int[logs.length];
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < logs.length; i++) {
            int a = i == 0 ? logs[i][1] : logs[i][1] - logs[i - 1][1];
            if (i == 0) unitOfTimesNeeded[i] = logs[i][1];
            else unitOfTimesNeeded[i] = logs[i][1] - logs[i - 1][1];
            max = Math.max(max, a);
        }
        for (int i = 0; i < unitOfTimesNeeded.length; i++) {
            if (unitOfTimesNeeded[i] == max) ans = Math.min(ans, logs[i][0]);
        }
        return ans;
    }
}