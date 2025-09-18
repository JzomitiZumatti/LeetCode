class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }
        for (int n : nums) {
            if (numSet.contains(original)) {
                original = 2 * original;
            } else {
                break;
            }
        }
        return original;
    }
}