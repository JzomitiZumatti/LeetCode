class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int min = 0;
        if (start < destination) {
            for (int i = start; i < destination; i++) {
                min += distance[i];
            }
        } else {
            for (int i = destination; i < start; i++) {
                min += distance[i];
            }
        }
        int sum = 0;
        for (int j : distance) {
            sum += j;
        }
        return Math.min(min, sum - min);
    }
}