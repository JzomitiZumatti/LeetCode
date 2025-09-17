class Solution {
    public int[] replaceElements(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = arr.length - 1; j > i; j--) {
                max = Math.max(max, arrCopy[j]);
            }
            arr[i] = i == arr.length - 1 ? -1 : max;
        }
        return arr;
    }
}