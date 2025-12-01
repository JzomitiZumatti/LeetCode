class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                if (!result.isEmpty()) result.deleteCharAt(result.length() - 1);
            } else if (c == '#') {
                if (!result.isEmpty()) result.append(result);
            } else if (c == '%') {
                if (!result.isEmpty()) result.reverse();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}