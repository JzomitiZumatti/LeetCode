class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1 && nums.size() >= 2) return true;

        int start = 0;
        while (start < nums.size() - k) {
            int len = 0;
            for (int i = start; i < nums.size() - (k + 1); i++) {
                int next = i + 1;
                if (nums.get(i) < nums.get(next) && nums.get(i + k) < nums.get(next + k)) len++;
                else break;
                if (len == k - 1) return true;
            }
            start++;
        }

        return false;
    }
}