class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) res++;
            }
        }
        return res;
    }
}