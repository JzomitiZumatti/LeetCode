class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedCopy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedCopy);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedCopy[i]) {
                counter++;
            }
        }
        return counter;
    }
}