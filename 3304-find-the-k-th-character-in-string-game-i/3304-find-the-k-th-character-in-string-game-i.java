class Solution {
    public char kthCharacter(int k) {
        StringBuilder ans = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        ans.append('a');
        while (ans.length() <= k) {
            for (int i = 0; i < ans.length(); i++) {
                int ascii = ans.charAt(i);
                char c = (char) (ascii + 1);
                stringBuilder.append(c);
            }
            ans.append(stringBuilder);
            stringBuilder.setLength(0);
        }
        return ans.charAt(k - 1);
    }
}