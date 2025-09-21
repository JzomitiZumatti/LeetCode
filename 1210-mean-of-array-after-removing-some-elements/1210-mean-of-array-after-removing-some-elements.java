class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int del = (int) (arr.length * 0.05);
        double res = 0;
        for (int i = del; i < arr.length - del; i++) {
            res += arr[i];
        }
        return res / (arr.length - (2 * del));
    }
}