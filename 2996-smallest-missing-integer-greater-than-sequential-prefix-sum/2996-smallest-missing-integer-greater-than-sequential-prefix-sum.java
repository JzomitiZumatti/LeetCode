class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (nums[i] - 1 == nums[i - 1]) sum += nums[i];
            else break;
            i++;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}