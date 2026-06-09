class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n / 3 != 0) {
            int temp = n % 3;
            if (temp == 2) return false;
            n /= 3;
        }
        return n != 2;
    }
}