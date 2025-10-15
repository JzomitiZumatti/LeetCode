class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int[] consec = new int[n];
        consec[0] = 1;
        for (int i = 1; i < n; i++) {
            consec[i] = (nums.get(i) > nums.get(i - 1) ? consec[i - 1] + 1 : 1);
        }
    
        int left = 1, right = n / 2, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (can(mid, consec)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    private static boolean can(int k, int[] consec) {
        for (int i = k; i < consec.length; i++) {
            if (consec[i] >= k && consec[i - k] >= k) return true;
        }
        return false;
    }
}