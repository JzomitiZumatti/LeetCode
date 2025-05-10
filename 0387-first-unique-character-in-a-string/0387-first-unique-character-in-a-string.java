class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> letters = new HashMap<>();
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            int frq = 1;
            if (letters.containsKey(s.charAt(i))) {
                frq += letters.get(s.charAt(i));
            }
            letters.put(s.charAt(i), frq);
        }
        for (int i = 0; i < s.length(); i++) {
            if (letters.get(s.charAt(i)) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}