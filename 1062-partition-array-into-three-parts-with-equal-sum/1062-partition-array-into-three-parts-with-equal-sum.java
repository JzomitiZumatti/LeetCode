class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sumSearching = 0;
        int sumCurrent = 0;
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            sumSearching += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sumCurrent += arr[j];
                if (sumCurrent == sumSearching) {
                    counter++;
                    break;
                }
            }
            sumCurrent = 0;
        }
        return counter == 3;
    }
}