class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        Arrays.sort(costs);
        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                ans++;
            } else break;
        }
        return ans;
    }
}