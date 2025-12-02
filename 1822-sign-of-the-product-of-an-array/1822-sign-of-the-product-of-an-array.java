class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        int zero = 0;
        for (int num : nums) {
            if (num == 0) zero++;
            else if (num < 0) neg++;
        }
        if (zero > 0) return 0;
        else {
            if (neg % 2 != 0) return -1;
            else return 1;
        }
    }
}