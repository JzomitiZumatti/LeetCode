class Solution {
    public int maxFreqSum(String s) {
        List<Character> vovels = List.of('a', 'e', 'i', 'o', 'u');
        Set<Character> vovelsSet = new HashSet<>(vovels);
        Map<Character, Integer> vovelsFreq = new HashMap<>();
        Map<Character, Integer> consonantFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (vovelsSet.contains(s.charAt(i))) {
                vovelsFreq.put(s.charAt(i), vovelsFreq.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                consonantFreq.put(s.charAt(i), consonantFreq.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int maxVovel = 0;
        for (Integer value : vovelsFreq.values()) {
            maxVovel = Math.max(maxVovel, value);
        }
        int maxConsonant = 0;
        for (Integer value : consonantFreq.values()) {
            maxConsonant = Math.max(maxConsonant, value);
        }
        return maxVovel + maxConsonant;
    }
}