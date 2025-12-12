class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        for (int i = k; i <= k + 100; i++) {
            if (!numbers.contains(i) && i % k == 0) return i;
        }
        return -1;
    }
}