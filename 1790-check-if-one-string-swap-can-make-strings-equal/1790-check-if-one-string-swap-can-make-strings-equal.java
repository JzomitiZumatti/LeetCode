class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] letters1 = new char[26];
        char[] letters2 = new char[26];
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            letters1[c1 - 'a']++;
            letters2[c2 - 'a']++;
            if (c1 != c2) counter++;
        }
        for (int i = 0; i < letters1.length; i++) {
            if (letters1[i] != letters2[i]) return false;
        }
        return counter == 0 || counter == 2;
    }
}