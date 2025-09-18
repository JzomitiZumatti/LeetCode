class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0L;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            StringBuilder str = new StringBuilder();
            str.append(nums[left]);
            str.append(nums[right]);
            res += Integer.parseInt(str.toString());
            left++;
            right--;
        }
        if (nums.length % 2 != 0) {
            res += nums[left];
        }
        return res;
    }
}