class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int counter = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num == 3 ? num - 1 : num % 4 == 1 ? num - 1 : num + 1;
            }
            counter++;
        }
        return counter;
    }
}