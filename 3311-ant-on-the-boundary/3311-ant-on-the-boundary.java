class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int res = 0;
        int ant = 0;
        for (int n : nums) {
            ant += n;
            if (ant == 0) res++;
        }
        return res;
    }
}