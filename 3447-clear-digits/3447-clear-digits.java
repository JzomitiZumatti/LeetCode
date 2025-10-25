class Solution {
    public String clearDigits(String s) {
        boolean[] pairs = new boolean[s.length()];
        Arrays.fill(pairs, true);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                pairs[i] = false;
                int j = i - 1;
                while (j >= 0) {
                    if (pairs[j]) {
                        pairs[j] = false;
                        break;
                    } else j--;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (pairs[i]) stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}