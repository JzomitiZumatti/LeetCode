class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1 && nums.size() >= 2) return true;

        List<Integer> startPoints = new ArrayList<>();

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
            }
        }

        Collections.sort(startPoints);

        int i = 0;
        while (i < startPoints.size()) {
            if (startPoints.contains(startPoints.get(i) + k) )return true;
            i++;
        }
        return false;
    }
}