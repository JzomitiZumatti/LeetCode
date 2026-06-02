class Solution {
    public int minCost(int n) {
        int ans = 0;
        for (int i = 1; i <= n - 1; i++) {
            ans += i;
        }
        return ans;
    }
}