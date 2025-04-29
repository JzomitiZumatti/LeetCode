class Solution {
    public int mySqrt(int x) {
        int left = 0, right = x;
        int mid = 0;
        long midSquare;
        while (left <= right){
            mid = left + (right - left) / 2;
            midSquare = (long) mid * mid;
            if (midSquare == x) {
                return mid;
            }
            if (midSquare < x) {
                left = mid + 1;
            }
            if (midSquare > x) {
                right = mid - 1;
            }
        }
        return right;
    }
}