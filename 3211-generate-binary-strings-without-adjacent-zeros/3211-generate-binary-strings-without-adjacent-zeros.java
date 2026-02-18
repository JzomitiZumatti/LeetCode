class Solution {
    public List<String> validStrings(int n) {
        List<String> path = new ArrayList<>();
        dfs(n, new StringBuilder(), path);
        return path;
    }

    private static void dfs(int n, StringBuilder stringBuilder, List<String> res) {
        if (stringBuilder.length() == n) {
            res.add(stringBuilder.toString());
            return;
        }
        if (stringBuilder.isEmpty() || stringBuilder.charAt(stringBuilder.length() - 1) != '0') {
            stringBuilder.append('0');
            dfs(n, stringBuilder, res);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append('1');
        dfs(n, stringBuilder, res);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }
}