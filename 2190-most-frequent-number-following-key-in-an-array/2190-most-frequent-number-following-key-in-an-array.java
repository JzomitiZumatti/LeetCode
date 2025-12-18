class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        int previous = nums[0];
        boolean isKey = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == key) {
                previous = nums[i];
                numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
                isKey = true;
            }
            if (isKey && nums[i] == previous) {
                numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
            } else {
                isKey = false;
                previous = nums[i];
            }
        }
        int max = -1;
        int maxFreq = -1;
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }
}