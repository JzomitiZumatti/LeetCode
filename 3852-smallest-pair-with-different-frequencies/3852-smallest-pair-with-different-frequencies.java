class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Arrays.sort(nums);
        int[] ans = {-1, -1};
        if (nums.length == 1) return ans;
        Map<Integer, Integer> digitFreq = new HashMap<>();
        for (int num : nums) {
            digitFreq.put(num, digitFreq.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && !Objects.equals(digitFreq.get(nums[i]), digitFreq.get(nums[j])))
                    return new int[]{nums[i], nums[j]};
            }
        }
        return ans;
    }
}