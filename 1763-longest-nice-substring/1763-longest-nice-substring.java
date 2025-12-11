class Solution {
    public String longestNiceSubstring(String s) {
        int left = 0;
        int max = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (left < s.length()) {
            int right = left + 1;
            while (right <= s.length()) {
                String sub = s.substring(left, right);
                if (isNice(sub)) {
                    if (sub.length() > max) {
                        max = sub.length();
                        stringBuilder.setLength(0);
                        stringBuilder.append(sub);
                    }
                }
                right++;
            }
            left++;
        }
        return stringBuilder.toString();
    }

    private static boolean isNice(String s) {
        Set<Integer> lowerCase = new HashSet<>();
        Set<Integer> upperCase = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c >= 65 && c <= 90) upperCase.add(c);
            else lowerCase.add(c);
        }
        for (Integer i : lowerCase) {
            if (!upperCase.contains(i - 32)) return false;
        }
        for (Integer i : upperCase) {
            if (!lowerCase.contains(i + 32)) return false;
        }
        return true;
    }
}