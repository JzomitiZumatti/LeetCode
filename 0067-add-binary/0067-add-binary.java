class Solution {
    public String addBinary(String a, String b) {
        StringBuilder total = new StringBuilder();
        int carry = 0;
        int sum;
        int aInt;
        int bInt;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            aInt = i >= 0 ? a.charAt(i) - '0' : 0;
            bInt = j >= 0 ? b.charAt(j) - '0' : 0;
            sum = aInt + bInt + carry;
            carry = sum / 2;
            total.append(sum % 2);
        }
        if (carry == 1) {
            total.append(carry);
        }
        return total.reverse().toString();
    }
}