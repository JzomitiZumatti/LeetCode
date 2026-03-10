class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefixProd = new int[n];
        prefixProd[0] = nums[0];
        int[] sufixProd = new int[n];
        sufixProd[0] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            prefixProd[i] = prefixProd[i - 1] * nums[i];
            sufixProd[i] = sufixProd[i - 1] * nums[n - (i + 1)];
        }
        res[0] = sufixProd[n - 2];
        res[n - 1] = prefixProd[n - 2];
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefixProd[i - 1] * sufixProd[n - (2 + i)];
        }
        return res;
    }
}