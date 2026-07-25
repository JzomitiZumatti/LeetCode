class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int prev = nums[i];
            if (prev % 2 == 0 && prev <= threshold) {
                ans = Math.max(ans, 1);
                if (i < nums.length - 1) {
                    int j = i + 1;
                    while (j < nums.length) {
                        int curr = nums[j];
                        if (curr > threshold || prev % 2 == curr % 2) break;
                        prev = curr;
                        j++;
                    }
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }
}