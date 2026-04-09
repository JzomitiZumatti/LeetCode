class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = nums.size();
        int i = 1;
        while (i <= nums.size()) {
            Set<Integer> unique = new HashSet<>();
            int left = 0;
            int right = i;
            while (right < nums.size()) {
                for (int j = left; j <= right; j++) {
                    unique.add(nums.get(j));
                }
                ans += (int) Math.pow(unique.size(), 2);
                unique.clear();
                left++;
                right++;
            }
            i++;
        }
        return ans;
    }
}