class Solution {
    public int getMaximumGenerated(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        if (arr.length > 1) arr[1] = 1;
        else return 0;
        int max = 1;
        int i = 2;
        while (i < arr.length) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
            }
            max = Math.max(max, arr[i]);
            i++;
        }
        return max;
    }
}