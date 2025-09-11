class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> less = new HashSet<>();
        for (int n : nums) {
            if (n > k) {
                unique.add(n);
            }
            if (n < k) {
                less.add(n);
            }
        }
        return unique.isEmpty() && !less.isEmpty() ? -1 : !less.isEmpty() ? -1 : unique.size();
    }
}