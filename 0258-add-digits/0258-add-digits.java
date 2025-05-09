class Solution {
    public int addDigits(int num) {
        int temp = num;
        int sum = 0;
        do {
            int digit = temp % 10;
            temp = temp / 10;
            sum += digit;
            if (temp == 0 && sum >= 10) {
                temp = sum;
                sum = 0;
            }
            if (temp == 0 && sum < 10) {
                break;
            }
        } while (true);
        return sum;
    }
}