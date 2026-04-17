class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> vovels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        int vovCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vovels.contains(c)) vovCounter++;
        }

        return vovCounter > 0;
    }
}