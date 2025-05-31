class Solution {
    public String addBinary(String a, String b) {
        StringBuilder total = new StringBuilder();
        int carry = 0;
        int sum;
        int aInt;
        int bInt;
        int length = Math.max(a.length(), b.length());
        if (a.length() > b.length()) {
            for (int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= b.length() - length; i--, j--) {
                aInt = a.charAt(i) - '0';
                if (j >= 0) {
                    bInt = b.charAt(j) - '0';
                } else {
                    bInt = 0;
                }
                sum = aInt + bInt + carry;
                carry = sum / 2;
                total.append(sum % 2);
            }
        } else if (a.length() < b.length()) {
            for (int i = b.length() - 1, j = a.length() - 1; i >= 0 && j >= a.length() - length; i--, j--) {
                bInt = b.charAt(i) - '0';
                if (j >= 0) {
                    aInt = a.charAt(j) - '0';
                } else {
                    aInt = 0;
                }
                sum = aInt + bInt + carry;
                carry = sum / 2;
                total.append(sum % 2);
            }
        } else {
            for (int i = length - 1; i >= 0; i--) {
                bInt = b.charAt(i) - '0';
                aInt = a.charAt(i) - '0';
                sum = aInt + bInt + carry;
                carry = sum / 2;
                total.append(sum % 2);
            }
        }
        if (carry == 1) {
            total.append(carry);
        }
        return total.reverse().toString();
    }
}