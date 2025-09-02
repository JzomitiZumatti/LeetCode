class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int n : nums) {
            if (String.valueOf(n).length() % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}