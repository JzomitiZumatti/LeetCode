class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans = {-1, -1};
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> numPos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            numPos.put(n, i);
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 1; i--) {
            int a = nums[i];
            for (int j = nums.length - 2; j >= 0; j--) {
                int b = nums[j];
                if (a > b && a + b == target) {
                    int prod = a * b;
                    if (prod > max) {
                        max = prod;
                        ans[0] = numPos.get(a);
                        ans[1] = numPos.get(b);
                    }
                }
            }
        }
        return ans;
    }
}