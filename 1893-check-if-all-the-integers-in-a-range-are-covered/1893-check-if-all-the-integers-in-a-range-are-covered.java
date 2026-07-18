class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> needed = new HashSet<>();
        for (int i = left; i <= right; i++) {
            needed.add(i);
        }
        for (int[] range : ranges) {
            for (int j = range[0]; j <= range[1]; j++) {
                needed.remove(j);
                if (needed.isEmpty()) return true;
            }
        }
        return false;
    }
}