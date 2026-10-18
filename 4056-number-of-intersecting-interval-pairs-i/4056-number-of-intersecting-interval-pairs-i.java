class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int ans = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                int maxStart = Math.max(intervals[i][0], intervals[j][0]);
                int minEnd = Math.min(intervals[i][1], intervals[j][1]);
                if (maxStart <= minEnd) ans++;
            }
        }
        return ans;
    }
}