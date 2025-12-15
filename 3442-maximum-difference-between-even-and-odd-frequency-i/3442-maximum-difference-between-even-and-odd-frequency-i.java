class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letterFreq.put(c, letterFreq.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (Integer value : letterFreq.values()) {
            if (value % 2 != 0) {
                for (Integer i : letterFreq.values()) {
                    if (i % 2 == 0) max = Math.max(max, value - i);
                }
            }
        }
        return max;
    }
}