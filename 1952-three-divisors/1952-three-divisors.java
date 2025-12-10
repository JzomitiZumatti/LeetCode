class Solution {
    public boolean isThree(int n) {
        if (n <= 2) return false;
        int counter = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) counter++;
            if (counter > 3) return false;
        }
        return counter == 3;
    }
}