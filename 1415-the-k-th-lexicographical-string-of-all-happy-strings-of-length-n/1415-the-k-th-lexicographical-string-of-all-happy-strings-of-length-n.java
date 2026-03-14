class Solution {
    public String getHappyString(int n, int k) {
        int maxLength = 3 * (int) Math.pow(2, n - 1);
        if (k > maxLength) return "";
        List<String> res = new ArrayList<>();
        Character[] arr = {'a', 'b', 'c'};
        StringBuilder path = new StringBuilder();
        dfs(res, arr, path, n);
        return res.get(k - 1);
    }

    private static void dfs(List<String> res, Character[] arr, StringBuilder path, int n) {
        if (path.length() == n) {
            res.add(path.toString());
            return;
        }

        for (Character character : arr) {
            if (path.isEmpty() || path.charAt(path.length() - 1) != character) {
                path.append(character);
                dfs(res, arr, path, n);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}