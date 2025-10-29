class Solution {
    public int smallestNumber(int n) {
        for (int i = 1; i <= n; i++) {
            int num = (int) Math.pow(2, i) - 1;
            if (num >= n) return num;
        }
        return 0;
    }
}