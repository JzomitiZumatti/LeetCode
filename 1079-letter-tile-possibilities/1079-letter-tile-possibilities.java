class Solution {
    public int numTilePossibilities(String tiles) {
        char[] letters = tiles.toCharArray();
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        boolean[] visited = new boolean[letters.length];
        Arrays.fill(visited, false);
        Arrays.sort(letters);
        dfs(letters, visited, ans, str);
        return ans.size();
    }

    private static void dfs(char[] letters, boolean[] visited, List<String> ans, StringBuilder str) {
        if (!str.isEmpty()) ans.add(str.toString());
        for (int i = 0; i < letters.length; i++) {
            if (i > 0 && letters[i] == letters[i - 1] && !visited[i - 1]) continue;
            if (!visited[i]) {
                str.append(letters[i]);
                visited[i] = true;
                dfs(letters, visited, ans, str);
                str.deleteCharAt(str.length() - 1);
                visited[i] = false;
            }
        }
    }
}