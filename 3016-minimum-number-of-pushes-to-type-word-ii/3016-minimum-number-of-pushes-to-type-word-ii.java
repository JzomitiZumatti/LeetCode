class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> letterFreq = new HashMap<>();
        char[] letters = word.toCharArray();
        for (char letter : letters) {
            letterFreq.put(letter, letterFreq.getOrDefault(letter, 0) + 1);
        }
        int ans = 0;
        if (letterFreq.size() <= 8) {
            for (Integer value : letterFreq.values()) {
                ans += value;
            }
        } else {
            List<Integer> vals = new ArrayList<>(letterFreq.values());
            vals.sort(Collections.reverseOrder());
            int multiplier = 1;
            int j = 1;
            for (int i = 0; i < vals.size(); i++) {
                ans += vals.get(i) * multiplier;
                j++;
                if (j > 8) {
                    multiplier++;
                    j = 1;
                }
            }
        }
        return ans;
    }
}