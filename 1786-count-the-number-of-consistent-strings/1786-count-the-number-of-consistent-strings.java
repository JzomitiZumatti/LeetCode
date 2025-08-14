class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        Set<Character> allow = allowed.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(HashSet::new));

        for (String w : words) {
            boolean flag = true;
            for (int i = 0; i < w.length(); i++) {
                if (!allow.contains(w.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) res++;
        }

        return res;
    }
}