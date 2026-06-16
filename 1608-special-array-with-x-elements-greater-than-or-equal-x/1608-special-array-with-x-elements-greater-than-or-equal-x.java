class Solution {
    public int specialArray(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            int counter = 0;
            for (int num : nums) {
                if (num >= i) counter++;;
            }
            if (counter == i) return i;
        }
        return -1;
    }
}