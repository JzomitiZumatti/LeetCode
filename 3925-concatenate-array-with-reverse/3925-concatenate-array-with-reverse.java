class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = 0;
        int j = ans.length - 1;
        for (int num : nums) {
            ans[i] = num;
            ans[j] = num;
            i++;
            j--;
        }
        return ans;
    }
}