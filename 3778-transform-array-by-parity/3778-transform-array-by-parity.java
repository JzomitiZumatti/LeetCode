class Solution {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                res[i] = 0;
            } else {
                res[i] = 1;
            }
            i++;
        }
        Arrays.sort(res);

        return  res;
    }
}