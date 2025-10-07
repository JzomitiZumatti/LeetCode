class Solution {
    public int findMaxK(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (num > 0 && set.contains(-num)) max = Math.max(max, num);
            if (num < 0 && set.contains(Math.abs(num))) max = Math.max(max, Math.abs(num));
        }
        return max < 0 ? -1 : max;
    }
}