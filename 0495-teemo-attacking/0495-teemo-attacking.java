class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int next = timeSeries[i + 1];
            if (timeSeries[i] + duration <= next) {
                totalDuration += duration;
            } else if (timeSeries[i] + duration > next) {
                totalDuration += next - timeSeries[i];
            }
        }
        return totalDuration + duration;
    }
}