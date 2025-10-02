class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];
        int i = 0;
        for (int[] point : points) {
            arr[i] = point[0];
            i++;
        }
        Arrays.sort(arr);
        int maxWidth = Integer.MIN_VALUE;
        for (int j = 1; j < arr.length; j++) {
            maxWidth = Math.max(maxWidth, Math.abs(arr[j] - arr[j - 1]));
        }
        return maxWidth;
    }
}