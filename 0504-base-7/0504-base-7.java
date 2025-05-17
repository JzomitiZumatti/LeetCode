class Solution {
    public String convertToBase7(int num) {
        StringBuilder sevenDigit = new StringBuilder();
        if (num == 0) {
            return String.valueOf(0);
        }
        boolean isNegative = num < 0;
        if (isNegative) {
            num = num * -1;
        }
        do {

            int left = num % 7;
            num = num / 7;
            sevenDigit.append(left);
        } while (num != 0);
        
        if (isNegative) {
            sevenDigit.append("-");
        }
        return sevenDigit.reverse().toString();
    }
}