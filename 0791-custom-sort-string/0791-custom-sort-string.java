class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res = new StringBuilder();
        Set<Character> mustHave = new HashSet<>();
        for (int i = 0; i < order.length(); i++) {
            mustHave.add(order.charAt(i));
        }

        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mustHave.contains(c)) letterFreq.put(c, letterFreq.getOrDefault(c, 0) + 1);
            else res.append(c);
        }

        for (int i = order.length() - 1; i >= 0; i--) {
            char c = order.charAt(i);
            if (letterFreq.containsKey(c)) res.repeat(c, letterFreq.get(c));
        }
        return res.reverse().toString();
    }
}