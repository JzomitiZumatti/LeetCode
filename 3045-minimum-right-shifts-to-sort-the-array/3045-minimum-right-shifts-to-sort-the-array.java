class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                int result = nums.size() - i;
                for (int j = i + 1; j < nums.size(); j++) {
                    if (nums.get(j) < nums.get(j - 1)) {
                        return -1;
                    }
                }
                return nums.get(0) > nums.get(nums.size() - 1) ? result : -1;
            }
        }
        return 0;
    }
}