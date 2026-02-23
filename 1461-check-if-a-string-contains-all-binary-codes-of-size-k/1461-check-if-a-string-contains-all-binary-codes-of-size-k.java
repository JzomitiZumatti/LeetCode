class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> unique = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilder.append(c);
            if (stringBuilder.length() == k) {
                unique.add(stringBuilder.toString());
                stringBuilder.deleteCharAt(0);
            }
        }
        return unique.size() == (int) Math.pow(2, k);
    }
}