class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ans = 0;
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> temp = new HashSet<>();
            temp.add(nums[i]);
            if (temp.size() == unique.size()) ans++;
            int j = i + 1;
            while (j < nums.length) {
                temp.add(nums[j]);
                if (temp.size() == unique.size()) {
                    ans += nums.length - j;
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}