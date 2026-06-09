class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        boolean c = true;
        while (c) {
            c = false;
            for (int i = 0; i < stringBuilder.length(); i++) {
                char l = stringBuilder.charAt(i);
                if (l == part.charAt(0)) {
                    if (i + part.length() <= stringBuilder.length() && stringBuilder.substring(i, i + part.length()).equals(part)) {
                        stringBuilder.delete(i, i + part.length());
                        c = true;
                        break;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}