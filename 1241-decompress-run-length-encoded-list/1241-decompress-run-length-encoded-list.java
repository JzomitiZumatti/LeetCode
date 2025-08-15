class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            length += nums[i];
        }

        int[] res = new int[length];
        int counter = 0;
        for (int i = 1; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                res[counter] = nums[i];
                counter++;
            }
        }
        return res;
    }
}