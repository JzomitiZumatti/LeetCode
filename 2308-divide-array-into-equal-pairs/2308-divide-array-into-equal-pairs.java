class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length / 2;
        int counter = 0;
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            }
        }
        return counter == size;
    }
}