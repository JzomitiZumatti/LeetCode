class Solution {
    public String addBinary(String a, String b) {
        StringBuilder total = new StringBuilder();
        int carry = 0;
        int sum;
        if (a.length() < b.length()) {
            a = addZeros(a, b.length() - a.length());
        } else if (b.length() < a.length()) {
            b = addZeros(b, a.length() - b.length());
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            int anInt = Integer.parseInt(String.valueOf(a.charAt(i)));
            int bInt = Integer.parseInt(String.valueOf(b.charAt(i)));
            sum = anInt + bInt + carry;
            carry = carry == 1 ? 0 : carry;
            if (sum > 1) {
                carry = 1;
            }
            total.append(sum == 3 ? 1
                    : sum == 2 ? 0 : sum == 1 ? 1 : 0);
        }
        if (carry != 0) {
            total.append(carry);
        }
        return total.reverse().toString();
    }

    public static String addZeros(String a, int length) {
        return "0".repeat(length) + a;
    }
}