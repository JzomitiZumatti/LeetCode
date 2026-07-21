class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int ans = events[0][0];
        int maxPressingTime = events[0][1];
        if (events.length == 1) return ans;
        else {
            for (int i = 1; i < events.length; i++) {
                int time = events[i][1] - events[i - 1][1];
                if (time >= maxPressingTime) {
                    if (time == maxPressingTime) ans = Math.min(ans, events[i][0]);
                    else ans = events[i][0];
                    maxPressingTime = time;
                }
            }
        }
        return ans;
    }
}