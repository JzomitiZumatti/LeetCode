class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> dublicate = new HashMap<>();
        for (int n : nums) {
            dublicate.put(n, dublicate.getOrDefault(n, 0) + 1);
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (dublicate.get(nums[i]) > 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}