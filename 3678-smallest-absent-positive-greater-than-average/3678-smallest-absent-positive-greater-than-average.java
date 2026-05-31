class Solution {
    public int smallestAbsent(int[] nums) {
        int avg = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            avg += num;
            set.add(num);
        }
        avg /= nums.length;
        for (int i = avg + 1; i <= 1000; i++) {
            if (!set.contains(i) && i > 0) return i;
        }
        return -1;
    }
}