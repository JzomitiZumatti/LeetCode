class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans = -1;
        int i = 0;
        while (i < nums.length - 1) {
            boolean flag = false;
            int prev = nums[i];
            int j = i + 1;
            if (nums[j] - prev == 1) {
                while (j < nums.length) {
                if (!flag && nums[j] - prev == 1) {
                    flag = true;
                    prev = nums[j];
                    j++;
                } else if (flag && nums[j] - prev == -1) {
                    flag = false;
                    prev = nums[j];
                    j++;
                } else break;
            }
                ans = Math.max(ans, j - i);
            }
            i++;
        }
        return ans;
    }
}