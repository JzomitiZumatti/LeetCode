class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> path = new ArrayList<>();
        dfs(s, 0, new StringBuilder(), path);
        return path;
    }

    private static void dfs(String s, int i, StringBuilder stringBuilder, List<String> res) {
        if (stringBuilder.length() == s.length()) {
            res.add(stringBuilder.toString());
            return;
        }
        char c = s.charAt(i);
        if (Character.isDigit(c)) {
            stringBuilder.append(c);
            dfs(s, i + 1, stringBuilder, res);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        } else {
            stringBuilder.append(String.valueOf(c).toLowerCase());
            dfs(s, i + 1, stringBuilder, res);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append(String.valueOf(c).toUpperCase());
            dfs(s, i + 1, stringBuilder, res);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}