class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] ans = {-1, -1};
        if (nums.length == 1) return ans;
        Arrays.sort(nums);
        Map<Integer, Integer> digitFreq = new HashMap<>();
        for (int num : nums) {
            digitFreq.put(num, digitFreq.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[0] && !Objects.equals(digitFreq.get(nums[i]), digitFreq.get(nums[0])))
                return new int[]{nums[0], nums[i]};
        }
        return ans;
    }
}