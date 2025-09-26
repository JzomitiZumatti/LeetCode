class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(day);
        }
        int[] dp = new int[days[days.length - 1] + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            if (travelDays.contains(i)) {
                dp[i] = Math.min(
                        dp[i - 1] + costs[0], Math.min(
                        dp[Math.max(0, i - 7)] + costs[1],
                        dp[Math.max(0, i - 30)] + costs[2]));
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[dp.length - 1];
    }
}