class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        List<String> d = new ArrayList<>();
        for (int i = num2.length() - 1; i >= 0; i--) {
            int n2 = num2.charAt(i) - '0';
            int carry = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int n1 = num1.charAt(j) - '0';
                int h = carry + n2 * n1;
                carry = h / 10;
                str.append(h % 10);
            }
            if (carry > 0) {
                str.append(carry);
            }
            str.reverse();
            str.append("0".repeat(Math.max(0, num2.length() - 1 - i)));
            d.add(str.toString());
            str.setLength(0);
        }
        String res = "0";

        for (String s : d) {
            res = addStrings(res, s);
        }
        if (res.charAt(0) == '0') return "0";
        return res;
    }

    private static String addStrings(String a, String b) {
        StringBuilder res = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }
}