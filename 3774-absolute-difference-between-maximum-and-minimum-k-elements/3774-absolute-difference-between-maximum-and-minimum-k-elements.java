class Solution {
    public int absDifference(int[] nums, int k) {
        int min = 0;
        int max =0;
        Arrays.sort(nums);
        int i = 0;
        while (i < k) {
            min += nums[i];
            max += nums[nums.length - (1 + i)];
            i++;
        }
        return Math.abs(max - min);
    }
}