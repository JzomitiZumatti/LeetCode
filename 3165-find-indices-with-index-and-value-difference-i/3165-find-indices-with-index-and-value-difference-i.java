class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        if (indexDifference == 0 && valueDifference == 0) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (conditionChecker(nums, i, j, indexDifference, valueDifference)) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    private static boolean conditionChecker(int[] nums, int i, int j, int indexDifference,
                                            int valueDifference) {
        return Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference;
    }
}