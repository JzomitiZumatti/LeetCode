class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i))) == 0) zeros++;
            else ones++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < ones - 1) {
            stringBuilder.append(1);
            i++;
        }
        i = 0;
        while (i < zeros) {
            stringBuilder.append(0);
            i++;
        }
        stringBuilder.append(1);
        return stringBuilder.toString();
    }
}