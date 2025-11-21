class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int total = arrivalTime + delayedTime;
        return total >= 24 ? total - 24 : total;
    }
}