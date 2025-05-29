class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] <= prev[1]) {
                prev = new int[]{prev[0], Math.max(prev[1], current[1])};
            } else {
                merged.add(prev);
                prev = current;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}