class Solution {
    public int numberOfChild(int n, int k) {
        int currentIndex = 0;
        int direction = 1;

        while (k > 0) {
            currentIndex += direction;
            k--;
            if (currentIndex == n - 1) {
                direction = -1;
            } else if (currentIndex == 0) {
                direction = 1;
            }
        }
        return currentIndex;
    }
}