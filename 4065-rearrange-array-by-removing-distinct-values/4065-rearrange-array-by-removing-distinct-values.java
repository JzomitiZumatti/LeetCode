class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] arr = new int[101];
        for (int n : nums) {
            arr[n - 1]++;
        }
        int i = 0;
        while (i < nums.length) {
            for (int j = 0; j < arr.length; j++) {
                int f = arr[j];
                if (f > 0) {
                    ans[i] = j + 1;
                    arr[j]--;
                    i++;
                }
            }
        }
        return ans;
    }
}