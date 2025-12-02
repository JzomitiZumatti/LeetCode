class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        int j = 0;
        while (j <= s.length() - 1) {
            Map<Character, Integer> letterFreq = new HashMap<>();
            boolean isFind = false;
            for (int i = j; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!letterFreq.containsKey(c) || letterFreq.get(c) < 2) {
                    letterFreq.put(c, letterFreq.getOrDefault(c, 0) + 1);
                } else {
                    max = Math.max(max, lengthSubArr(letterFreq));
                    isFind = true;
                    break;
                }
            }
            if (!isFind) max = Math.max(max, lengthSubArr(letterFreq));
            j++;
        }
        return max;
    }

    private static int lengthSubArr(Map<Character, Integer> map) {
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }
}