class Solution {
    public int vowelConsonantScore(String s) {
        Set<Character> vovels = new HashSet<>();
        vovels.add('a');
        vovels.add('e');
        vovels.add('i');
        vovels.add('o');
        vovels.add('u');
        int vovelCounter = 0;
        int consonantCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asci = c;
            if (vovels.contains(c)) vovelCounter++;
            else if (asci > 97 && asci < 123) consonantCounter++;
        }
        return consonantCounter > 0 ? vovelCounter / consonantCounter : 0;
    }
}