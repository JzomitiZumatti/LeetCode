class Solution {
    public boolean validDigit(int n, int x) {
        boolean isPresent = false;
        while (n / 10 > 0) {
            int temp = n % 10;
            if (temp == x) isPresent = true;
            n /= 10;
        }
        return n != x && isPresent;
    }
}