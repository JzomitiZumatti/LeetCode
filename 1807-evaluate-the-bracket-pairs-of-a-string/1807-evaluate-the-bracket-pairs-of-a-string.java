class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> keyWord = new HashMap<>();
        for (List<String> strings : knowledge) {
            keyWord.put(strings.getFirst(), strings.getLast());
        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                int start = i + 1;
                while (s.charAt(i) != ')') {
                    i++;
                }
                String str = s.substring(start, i);
                if (keyWord.containsKey(str)) ans.append(keyWord.get(str));
                else ans.append('?');
            } else ans.append(c);
            i++;
        }
        return ans.toString();
    }
}