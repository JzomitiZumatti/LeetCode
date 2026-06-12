class Solution {
    public String reorderSpaces(String text) {
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') counter++;
        }
        String[] words = text.trim().split("\\s+");
        int nOfSpaces = words.length > 1 ? counter / (words.length - 1) : counter;
        for (int i = 0; i < words.length; i++) {
            ans.append(words[i]);
            if (i == words.length - 1) ans.repeat(" ", counter);
            else {
                ans.repeat(" ", nOfSpaces);
                counter -= nOfSpaces;
            }
        }
        return ans.toString();
    }
}