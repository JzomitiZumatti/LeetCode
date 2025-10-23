class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                int mOr = (Integer.parseInt(String.valueOf(s.charAt(i - 1))) +
                        Integer.parseInt(String.valueOf(s.charAt(i)))) % 10;
                stringBuilder.append(mOr);
            }
            s = stringBuilder.toString();
        }
        return Integer.parseInt(String.valueOf(s.charAt(0))) ==
                Integer.parseInt(String.valueOf(s.charAt(1)));
    }
}