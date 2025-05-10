class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        int mid;
        long midSquare;
        while (left <= right) {
            mid = left + (right - left) / 2;
            midSquare = (long) mid * mid;
            if (midSquare == num) {
                return true;
            }
            if (midSquare < num) {
                left = mid + 1;
            }
            if (midSquare > num) {
                right = mid - 1;
            }
        }
        return false;
    }
}