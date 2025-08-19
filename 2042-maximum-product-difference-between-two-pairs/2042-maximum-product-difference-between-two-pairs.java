class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int lR = 1;
        int rR = 1;
        int counter = 0;
        while (left < right && counter < 2) {
            lR *= nums[left];
            rR *= nums[right];
            left++;
            right--;
            counter++;
        }

        return rR - lR;
    }
}