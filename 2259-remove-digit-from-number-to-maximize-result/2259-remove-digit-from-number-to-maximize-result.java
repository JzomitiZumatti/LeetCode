class Solution {
    public String removeDigit(String number, char digit) {
        String ans = "0";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                if (i + 1 < number.length()) str.append(number, 0, i).append(number.substring(i + 1));
                else str.append(number, 0, i);
            }
            ans = max(ans, str.toString());
            str.setLength(0);
        }
        return ans;
    }

    private static String max(String a, String b) {
        if (a.length() != b.length()) return a.length() > b.length() ? a : b;
        for (int i = 0; i < a.length(); i++) {
            int a1 = a.charAt(i) - '0';
            int b1 = b.charAt(i) - '0';
            if (a1 != b1) return a1 > b1 ? a : b;
        }
        return a;
    }
}