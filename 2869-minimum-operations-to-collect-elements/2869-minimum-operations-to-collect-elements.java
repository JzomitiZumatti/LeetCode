class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            expected.add(i);
        }

        for (int i = nums.size() - 1; i >= 0; i--) {
            actual.add(nums.get(i));
            if (isEqual(expected, actual)) return nums.size() - i;
        }
        return -1;
    }

    private static boolean isEqual(Set<Integer> set1, Set<Integer> set2) {
        for (Integer i : set1) {
            if (!set2.contains(i)) return false;
        }
        return true;
    }
}