class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> letterLastPos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!letterLastPos.containsKey(c)) {
                for (int j = s.length() - 1; j >= i; j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        letterLastPos.put(c, j);
                        break;
                    }
                }
            }
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            end = Math.max(end, letterLastPos.get(c));
            if (i == end) {
                res.add(end - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}