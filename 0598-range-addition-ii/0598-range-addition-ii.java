class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int ans = m * n;
        if (ops.length == 0) return ans;
        int minM = m;
        int minN = n;
        for (int[] op : ops) {
            minM = Math.min(minM, op[0]);
            minN = Math.min(minN, op[1]);
        }
        return minM * minN;
    }
}