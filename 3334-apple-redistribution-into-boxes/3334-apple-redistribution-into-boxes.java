class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSize = 0;
        for (int a : apple) {
            appleSize += a;
        }

        Arrays.sort(capacity);
        int counter = 0;
        int capacitySum = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            counter++;
            capacitySum += capacity[i];
            if (capacitySum >= appleSize) break;
        }
        return counter;
    }
}