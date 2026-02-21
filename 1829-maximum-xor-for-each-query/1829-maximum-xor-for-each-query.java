class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (int) (Math.pow(2, maximumBit) - 1);
        int[] arr = new int[nums.length];
        int previous = 0;
        int current;
        int j = nums.length - 1;
        for (int num : nums) {
            current = previous ^ num;
            previous = current;
            if (current == max) arr[j] = 0;
            else arr[j] = max - current;
            j--;
        }
        return arr;
    }
}