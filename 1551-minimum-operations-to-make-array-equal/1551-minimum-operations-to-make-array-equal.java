class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        int target = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
            target += arr[i];
        }
        target /= n;
        int ans = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > target) ans += arr[i] - target;
        }
        return ans;
    }
}