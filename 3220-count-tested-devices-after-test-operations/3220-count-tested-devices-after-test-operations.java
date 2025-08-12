class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int counter = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                counter++;
                for (int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = batteryPercentages[j] > 0 ? batteryPercentages[j] - 1 : 0;
                }
            }
        }
        return counter;
    }
}