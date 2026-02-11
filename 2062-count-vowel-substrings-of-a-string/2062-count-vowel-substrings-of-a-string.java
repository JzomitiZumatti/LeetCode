class Solution {
    public int countVowelSubstrings(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            Set<Character> vovels = new HashSet<>();
            char c = word.charAt(i);
            if (isVovel(c)) {
                vovels.add(c);
                for (int j = i + 1; j < word.length(); j++) {
                    char cc = word.charAt(j);
                    if (isVovel(cc)) {
                        vovels.add(cc);
                        if (vovels.size() >= 5) counter++;
                    }
                    else break;
                }
            }
            vovels.clear();
        }
        return counter;
    }

    private static boolean isVovel(char c) {
        Set<Character> vovels = new HashSet<>();
        vovels.add('a');
        vovels.add('e');
        vovels.add('i');
        vovels.add('o');
        vovels.add('u');
        return vovels.contains(c);
    }
}