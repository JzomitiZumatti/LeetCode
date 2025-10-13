class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        int current = 0;
        for (int i = 1; i < words.length; i++) {
            if (!Arrays.equals(wordChar(words[current]), wordChar(words[i])) && i == words.length - 1) {
                res.add(words[current]);
                res.add(words[i]);
            } else if (!Arrays.equals(wordChar(words[current]), wordChar(words[i]))) {
                res.add(words[current]);
                current = i;
            }
        }
        if (!res.contains(words[current])) res.add(words[current]);
        return res;
    }

    private static char[] wordChar(String s) {
        char[] wC = s.toCharArray();
        Arrays.sort(wC);
        return wC;
    }
}