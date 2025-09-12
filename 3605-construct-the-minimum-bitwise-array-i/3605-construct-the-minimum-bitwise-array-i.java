class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int j = 0;
            int bs = 0;
            boolean flag = true;
            while (j <= nums.get(i)) {
                bs = j | (j + 1);
                if (bs == nums.get(i)) {
                    flag = false;
                    break;
                }
                j++;
            }
            res[i] = flag ? -1 : j;
        }
        return res;
    }
}