class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> keyWord = new HashMap<>();
        for (List<String> strings : knowledge) {
            keyWord.put(strings.getFirst(), strings.getLast());
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                flag = true;
                start = i;
            }
            if (!flag) stringBuilder.append(c);
            if (c == ')') {
                flag = false;
                String temp = s.substring(start + 1, i);
                if (keyWord.containsKey(temp)) stringBuilder.append(keyWord.get(temp));
                else stringBuilder.append('?');
            }
        }
        return stringBuilder.toString();
    }
}