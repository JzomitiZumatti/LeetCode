class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a';
        Map<Character, Integer> alphabetToRight = new HashMap<>();
        Map<Character, Integer> alphabetToLeft = new HashMap<>();
        int i = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetToRight.put(c, i);
            i++;
        }

        i = 1;
        for (char c = 'z'; c >= 'a'; c--) {
            alphabetToLeft.put(c, i);
            i++;
        }

        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == current) time++;
            else {
                boolean isRight = Math.abs(alphabetToRight.get(current) - alphabetToRight.get(word.charAt(j))) <= 13;
                if (isRight) {
                    time += Math.abs(alphabetToRight.get(word.charAt(j)) - alphabetToRight.get(current)) + 1;
                } else {
                    if ((int) current < (int) word.charAt(j))time += alphabetToRight.get(current) - 1 + alphabetToLeft.get(word.charAt(j)) + 1;
                    else time += alphabetToLeft.get(current) - 1 + alphabetToRight.get(word.charAt(j)) + 1;
                }
                current = word.charAt(j);
            }
        }
        return time;
    }
}