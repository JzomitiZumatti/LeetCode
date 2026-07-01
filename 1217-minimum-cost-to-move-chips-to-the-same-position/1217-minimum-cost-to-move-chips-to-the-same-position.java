class Solution {
    public int minCostToMoveChips(int[] position) {
        int p = 0;
        int u = 0;
        for (int n : position) {
            if (n % 2 == 0) p++;
            else u++;
        }
        return Math.min(p, u);
    }
}