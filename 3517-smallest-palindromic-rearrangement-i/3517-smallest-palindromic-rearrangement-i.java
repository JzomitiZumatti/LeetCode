class Solution {
    public String smallestPalindrome(String s) {
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            letterFreq.put(s.charAt(i), letterFreq.getOrDefault(s.charAt(i), 0) + 1);
        }
        Map<Character, Integer> sortedMap = new TreeMap<>(letterFreq);
        StringBuilder stringBuilder = new StringBuilder();
        char mid = '-';
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            int freq = entry.getValue() / 2;
            if (entry.getValue() % 2 != 0) mid = entry.getKey();
            stringBuilder.repeat(entry.getKey(), freq);
        }
        String first = stringBuilder.toString();
        String second = stringBuilder.reverse().toString();
        if (mid != '-') return first + mid + second;
        else return first + second;
    }
}