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
        System.out.println(a);
        for (int i = a.length() - 1; i >= 0; i--) {
            int anInt = a.charAt(i) - '0';
            int bInt = b.charAt(i) - '0';
            sum = anInt + bInt + carry;
            carry = sum / 2;
            total.append(sum % 2);
        }
        if (carry == 1) {
            total.append(carry);
        }
        return total.reverse().toString();
    }

    public static String addZeros(String a, int length) {
        return "0".repeat(length) + a;
    }
}