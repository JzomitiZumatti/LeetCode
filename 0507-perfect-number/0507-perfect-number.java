class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 0;
        int i = 1;
        do {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        } while (i < num && sum <= num);
        return sum == num;
    }
}