class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int prev = nums[i];
            if (prev % 2 == 0 && prev <= threshold) {
                ans = Math.max(ans, 1);
                boolean f = true;
                if (i < nums.length - 1) {
                    for (int j = i + 1; j < nums.length; j++) {
                        int curr = nums[j];
                        if (curr > threshold || prev % 2 == curr % 2) {
                            ans = Math.max(ans, j - i);
                            f = false;
                            break;
                        }
                        prev = curr;
                    }
                    if (f)  ans = Math.max(ans, nums.length - i);
                }
            }
        }
        return ans;
    }
}