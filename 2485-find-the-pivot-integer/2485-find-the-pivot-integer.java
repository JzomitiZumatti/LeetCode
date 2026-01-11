class Solution {
    public int pivotInteger(int n) {
        int[] arr = new int[n];
        int genSum = 0;
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
            genSum += i;
        }
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
            for (int j = i; j < arr.length; j++) {
                if (genSum - tempSum + arr[i] == tempSum) return arr[i];
            }
        }
        return -1;
    }
}