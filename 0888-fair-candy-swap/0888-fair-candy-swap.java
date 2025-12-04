class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int a : aliceSizes) {
            aliceSum += a;
        }

        for (int b : bobSizes) {
            bobSum += b;
        }

        for (int i = 0; i < aliceSizes.length; i++) {
            int tempA = aliceSum - aliceSizes[i];
            for (int j = 0; j < bobSizes.length; j++) {
                int temB = bobSum - bobSizes[j];
                if (tempA + bobSizes[j] == temB + aliceSizes[i]) return new int[] {aliceSizes[i], bobSizes[j]};
            }
        }
        return new int[]{};
    }
}