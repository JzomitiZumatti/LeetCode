class Solution {
    public String trimTrailingVowels(String s) {
        Set<Character> vovels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        int end = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (vovels.contains(c)) end = i;
            else break;
        }
        return s.substring(0, end);
    }
}