class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> list = new ArrayList<>();
        for (int[] point : points) {
            list.add(point[0]);
        }
        Collections.sort(list);
        int maxWidth = Integer.MIN_VALUE;
        for (int i = 1; i < list.size(); i++) {
            maxWidth = Math.max(maxWidth, Math.abs(list.get(i) - list.get(i - 1)));
        }
        return maxWidth;
    }
}