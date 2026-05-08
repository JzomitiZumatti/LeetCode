class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int k = 0;
            for (int j = image[0].length - 1; j >= 0; j--) {
                ans[i][k] = image[i][j] == 1 ? 0 : 1;
                k++;
            }
        }
        return ans;
    }
}