class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        List<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        dfs(open, close, res, path, n);
        return res;
    }

    private static void dfs(int open, int close, List<String> res, StringBuilder path, int n) {
        if (path.length() == n * 2) {
            res.add(path.toString());
            return;
        }

        if (open < n) {
            path.append('(');
            open++;
            dfs(open, close, res, path, n);
            path.deleteCharAt(path.length() - 1);
            open--;
        }
        if (close < open && open > 0) {
            path.append(')');
            close++;
            dfs(open, close, res, path, n);
            path.deleteCharAt(path.length() - 1);
        }
    }
}