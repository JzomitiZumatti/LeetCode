class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        for (int value : nums1) {
            for (int i : nums2) {
                if (value % (i * k) == 0) {
                    res++;
                }
            }
        }
        return res;
    }
}