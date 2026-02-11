class Solution {
    public int countVowelSubstrings(String word) {
        int counter = 0;
        Set<Character> vovels = new HashSet<>();
        vovels.add('a');
        vovels.add('e');
        vovels.add('i');
        vovels.add('o');
        vovels.add('u');
        for (int i = 0; i < word.length(); i++) {
            Set<Character> sub = new HashSet<>();
            char c = word.charAt(i);
            if (vovels.contains(c)) {
                sub.add(c);
                for (int j = i + 1; j < word.length(); j++) {
                    char cc = word.charAt(j);
                    if (vovels.contains(cc)) {
                        sub.add(cc);
                        if (sub.size() >= 5) counter++;
                    }
                    else break;
                }
            }
        }
        return counter;
    }
}