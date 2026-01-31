class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] isUsed = new boolean[baskets.length];
        Arrays.fill(isUsed, false);
        int counter = 0;
        for (int fruit : fruits) {
            boolean isFit = false;
            for (int i = 0; i < baskets.length; i++) {
                if (baskets[i] >= fruit && !isUsed[i]) {
                    isUsed[i] = true;
                    isFit = true;
                    break;
                }
            }
            if (!isFit) {
                for (int i = 0; i < baskets.length; i++) {
                    if (!isUsed[i]) {
                        counter++;
                        break;
                    }
                }
            }
        }
        return counter;
    }
}