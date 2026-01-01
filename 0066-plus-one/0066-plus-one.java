import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        boolean flag = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            } else if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    result[0] = 1;
                    flag = true;
                }
            }
        }
        return flag ? result : digits;
    }
}