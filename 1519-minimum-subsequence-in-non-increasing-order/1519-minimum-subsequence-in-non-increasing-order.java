class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int genSum = 0;
        int sumRight = 0;
        for (int n : nums) {
            genSum += n;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            res.add(nums[i]);
            sumRight += nums[i];
            genSum -= nums[i];
            if (sumRight > genSum) break;
        }
        return res;
    }
}