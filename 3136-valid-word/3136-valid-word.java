class Solution {
    public boolean isValid(String word) {
        Set<Integer> allowedChar = new HashSet<>();
        for (int i = 48; i <= 57; i++) {
            allowedChar.add(i);
        }

        for (int i = 65; i <= 90; i++) {
            allowedChar.add(i);
        }

        for (int i = 97; i <= 122; i++) {
            allowedChar.add(i);
        }
        Set<Character> vovels = new HashSet<>();
        vovels.add('a');
        vovels.add('A');
        vovels.add('e');
        vovels.add('E');
        vovels.add('i');
        vovels.add('I');
        vovels.add('o');
        vovels.add('O');
        vovels.add('u');
        vovels.add('U');
        boolean isVowel = false;
        boolean isConson = false;

        if (word.length() < 3) return false;
        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            char c = word.charAt(i);
            if (!allowedChar.contains(ascii)) return false;
            else if (vovels.contains(c)) isVowel = true;
            else if (!vovels.contains(c) && !Character.isDigit(c)) isConson = true;
        }
        return isVowel && isConson;
    }
}