class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
            if (stringBuilder.toString().equals(s)) return true;
        }
        return false;
    }
}