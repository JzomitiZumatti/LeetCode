class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        Set<String> used = new HashSet<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String w2 = words[j];
                if (w2.contains(w1)) {
                    if (used.isEmpty() || !used.contains(w1)) {
                        used.add(w1);
                        res.add(w1);
                    }

                }
            }
        }
        return res;
    }
}