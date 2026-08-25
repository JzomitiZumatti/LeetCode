class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int sqrtArea = (int) Math.sqrt(area);
        int i = 1;
        while (i <= sqrtArea) {
            if (area % i == 0) ans[1] = i;
            i++;
        }
        ans[0] = area / ans[1];
        return ans;
    }
}