class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (num % 2 == 0) counter++;
            if (counter > 1) return true;
        }
        return false;
    }
}