class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int[] arr = new int[numOnes + numZeros + numNegOnes];
        int i = 0;
        if (numOnes > 0) {
            int counter = 0;
            while (counter < numOnes) {
                arr[i] = 1;
                counter++;
                i++;
            }
        }
        if (numZeros > 0) {
            int counter = 0;
            while (counter < numZeros) {
                arr[i] = 0;
                counter++;
                i++;
            }
        }
        if (numNegOnes > 0) {
            int counter = 0;
            while (counter < numNegOnes) {
                arr[i] = -1;
                counter++;
                i++;
            }
        }
        int sum = 0;
        for (int j = 0; j < k; j++) {
            sum += arr[j];
        }
        return sum;
    }
}