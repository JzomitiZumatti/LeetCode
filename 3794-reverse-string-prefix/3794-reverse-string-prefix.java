class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder prefixReverse = new StringBuilder();
        prefixReverse.append(s.substring(0, k)).reverse();
        stringBuilder.append(prefixReverse);
        prefixReverse.setLength(0);
        if (s.length() > k) prefixReverse.append(s.substring(k, s.length()));
        stringBuilder.append(prefixReverse);
        return stringBuilder.toString();
    }
}