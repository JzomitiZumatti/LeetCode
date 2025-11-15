class Solution {
    public String majorityFrequencyGroup(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> letterFreq= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            letterFreq.put(s.charAt(i), letterFreq.getOrDefault(s.charAt(i), 0) + 1);
        }

        int maxFreqGen = getMaxFreqGen(letterFreq);

        for (Map.Entry<Character, Integer> entry : letterFreq.entrySet()) {
            if (entry.getValue() == maxFreqGen) stringBuilder.append(entry.getKey());
        }
        return stringBuilder.toString();
    }

    private static int getMaxFreqGen(Map<Character, Integer> letterFreq) {
        Map<Integer, Integer> freqFreq = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : letterFreq.entrySet()) {
            freqFreq.put(entry.getValue(), freqFreq.getOrDefault(entry.getValue(), 0) + 1);
        }

        int maxFreqGen = 0;
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : freqFreq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqGen = entry.getKey();
            } else if (entry.getValue() == maxFreq) {
                if (entry.getKey() > maxFreqGen) {
                    maxFreqGen = entry.getKey();
                }
            }
        }
        return maxFreqGen;
    }
}