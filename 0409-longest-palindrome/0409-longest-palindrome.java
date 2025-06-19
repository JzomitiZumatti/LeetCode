class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> lettersFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            lettersFreq.put(key, lettersFreq.getOrDefault(key, 0) + 1);
        }

        int result = 0;
        boolean hasOdd = false;
        for (int count : lettersFreq.values()) {
            if (count % 2 == 0) {
                result += count;
            } else {
                result += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) result += 1;
        return result;
    }
}