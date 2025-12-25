class Solution {
    public boolean scoreBalance(String s) {
        Map<Character, Integer> letterPos = new HashMap<>();
        int position = 1;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            letterPos.put(letter, position++);
        }
        int sumLeft = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sumLeft += letterPos.get(s.charAt(i));
            int sumRight = 0;
            for (int j = i + 1; j < s.length(); j++) {
                sumRight += letterPos.get(s.charAt(j));
            }
            if (sumLeft == sumRight) return true;
        }
        return false;
    }
}