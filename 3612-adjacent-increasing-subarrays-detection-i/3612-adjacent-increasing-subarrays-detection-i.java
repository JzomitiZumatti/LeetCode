class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1 && nums.size() >= 2) return true;

        Set<Integer> startPoints = new HashSet<>();

        for (int start = 0; start <= nums.size() - k; start++) {
            boolean isValid = true;

            for (int i = start; i < start + k - 1; i++) {
                if (nums.get(i) >= nums.get(i + 1)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                startPoints.add(start);
                if (startPoints.contains(start - k)) return true;
            }
        }
        return false;
    }
}