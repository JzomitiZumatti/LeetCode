class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arrCopy = Arrays.copyOf(nums, nums.length);
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < arrCopy.length; i++) {
            int counter = 0;
            while (nums[counter] != arrCopy[i]) {
                counter++;
            }
            res[i] = counter;
        }
        return res;
    }
}