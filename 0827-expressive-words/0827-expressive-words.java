class Solution {
    public int expressiveWords(String s, String[] words) {
        int counter = 0;
        int word = 0;
        while (word < words.length) {
            boolean res = false;
            for (int i = 0, j = 0; i < s.length() && j < words[word].length(); ) {
                int first = 0;
                int second = 0;
                char sC = s.charAt(i);
                char wC = words[word].charAt(j);
                while (i < s.length() && s.charAt(i) == sC) {
                    first++;
                    i++;
                }
                while (j < words[word].length() && words[word].charAt(j) == wC) {
                    second++;
                    j++;
                }
                if (sC == wC && (first == second || (first >= 3 && first > second))) {
                    res = true;
                } else {
                    break;
                }
                if (res && i == s.length() && j == words[word].length()) {
                    counter++;
                }
            }
            word++;
        }
        return counter;
    }
}