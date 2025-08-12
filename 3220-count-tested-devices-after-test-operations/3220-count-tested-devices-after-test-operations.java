class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int counter = 0;
        for (int batteryPercentage : batteryPercentages) {
            if (batteryPercentage - counter > 0) {
                counter++;
            }
        }
        return counter;
    }
}