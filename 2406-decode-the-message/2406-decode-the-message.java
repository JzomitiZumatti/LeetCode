class Solution {
    public String decodeMessage(String key, String message) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Character> oldNew = new HashMap<>();
        String keyWithoutBackspace = key.replaceAll("\\s+", "");
        int j = 0;
        for (int i = 0; i < keyWithoutBackspace.length(); i++) {
            if (!oldNew.containsKey(keyWithoutBackspace.charAt(i))) {
                oldNew.put(keyWithoutBackspace.charAt(i), alphabet[j]);
                j++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') stringBuilder.append(" ");
            else stringBuilder.append(oldNew.get(message.charAt(i)));
        }
        return stringBuilder.toString();
    }
}