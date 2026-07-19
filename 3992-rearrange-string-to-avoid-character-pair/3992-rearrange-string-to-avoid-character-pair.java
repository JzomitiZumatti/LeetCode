class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] letters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);
        }
        Arrays.sort(letters);
        StringBuilder ans = new StringBuilder();
        for (char letter : letters) {
            ans.append(letter);
        }
        if (x > y) {
            return ans.toString();
        } else return ans.reverse().toString();
    }
}