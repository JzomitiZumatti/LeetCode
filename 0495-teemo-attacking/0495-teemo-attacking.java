class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int next = i + 1 < timeSeries.length ? timeSeries[i + 1] : timeSeries[i];
            if (timeSeries[i] + duration <= next) {
                totalDuration += duration;
            } else if (timeSeries[i] + duration > next) {
                totalDuration += next - timeSeries[i];
            }
        }
        return totalDuration + duration;
    }
}