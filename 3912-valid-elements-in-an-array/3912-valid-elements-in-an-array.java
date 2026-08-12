class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
        int lMax = -1;
        int rMax = -1;
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
            lMax = Math.max(lMax, nums[i]);
            rMax = Math.max(rMax, nums[j]);
            leftMax[i] = lMax;
            rightMax[j] = rMax;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1) ans.add(nums[i]);
            else if (nums[i] > rightMax[i + 1] || nums[i] > leftMax[i - 1]) ans.add(nums[i]);
        }
        return ans;
    }
}