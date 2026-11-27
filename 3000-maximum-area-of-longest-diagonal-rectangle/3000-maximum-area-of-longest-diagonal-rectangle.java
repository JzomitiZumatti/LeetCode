class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0L;
        Map<Double, List<Integer>> diagIndex = new HashMap<>();
        int[] areas = new int[dimensions.length];
        for (int i = 0; i < dimensions.length; i++) {
            int a = dimensions[i][0];
            int b = dimensions[i][1];
            double d = Math.sqrt((a * a) + (b * b));
            areas[i] = a * b;
            diagIndex.putIfAbsent(d, new ArrayList<>());
            diagIndex.get(d).add(i);
            if (d > max) {
                max = d;
            }
        }
        int maxArea = 0;
        for (int i = 0; i < diagIndex.get(max).size(); i++) {
            int j = diagIndex.get(max).get(i);
            maxArea = Math.max(maxArea, areas[j]);
        }
        return maxArea;
    }
}