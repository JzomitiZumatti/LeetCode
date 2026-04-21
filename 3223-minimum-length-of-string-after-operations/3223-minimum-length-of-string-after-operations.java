class Solution {
    public int minimumLength(String s) {
        int ans = 0;
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letterFreq.put(c, letterFreq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : letterFreq.entrySet()) {
            if (entry.getValue() < 3) ans += entry.getValue();
            else if (entry.getValue() % 2 != 0) ans += 1;
            else ans += 2;
        }
        return ans;
    }
}