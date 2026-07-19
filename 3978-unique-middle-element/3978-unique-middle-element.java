class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int[] freqs = new int[100];
        for (int num : nums) {
            freqs[num - 1]++;
        }
        return freqs[nums[(nums.length / 2)] - 1]  == 1;
    }
}