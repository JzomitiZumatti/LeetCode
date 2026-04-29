class Solution {
    public int countQuadruplets(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                int b = nums[j];
                for (int k = j + 1; k < nums.length - 1; k++) {
                    int c = nums[k];
                    for (int l = k + 1; l < nums.length; l++) {
                        int d = nums[l];
                        if (a + b + c == d) ans++;
                    }
                }
            }
        }
        return ans;
    }
}