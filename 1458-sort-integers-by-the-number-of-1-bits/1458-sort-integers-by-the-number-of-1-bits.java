class Solution {
    public int[] sortByBits(int[] arr) {
        int[] sorted = new int[arr.length];
        int[] bitSum = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            bitSum[i] = binarySum(arr[i]);
        }
        int maxBit = Integer.MIN_VALUE;
        int minBit = Integer.MAX_VALUE;

        for (int b : bitSum) {
            maxBit = Math.max(maxBit, b);
            minBit = Math.min(minBit, b);
        }

        if (minBit == maxBit) {
            return arr;
        }
        int counter = 0;
        while (counter < arr.length) {
            for (int i = 0; i <= maxBit; i++) {
                for (int j = 0; j < bitSum.length; j++) {
                    if (bitSum[j] == i) {
                        if (counter == arr.length) break;
                        sorted[counter] = arr[j];
                        counter++;
                    }
                }
            }
        }

        return sorted;
    }

    private static int binarySum(int n) {
        String binaryStringPositive = Integer.toBinaryString(n);
        int sum = 0;
        for (int i = 0; i < binaryStringPositive.length(); i++) {
            sum += Integer.parseInt(String.valueOf(binaryStringPositive.charAt(i)));
        }
        return sum;
    }
}