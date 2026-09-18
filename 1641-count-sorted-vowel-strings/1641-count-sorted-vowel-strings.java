class Solution {
    public int countVowelStrings(int n) {
        Character[] vowels = {'a','e','i','o','u'};
        List<List<Character>> ans = new ArrayList<>();
        List<Character> path = new ArrayList<>();
        int start = 0;
        backtrack(ans, path, vowels, start, n);
        return ans.size();
    }

    private static void backtrack(List<List<Character>> ans, List<Character> path, Character[] vowels, int start, int n) {
        if (path.size() == n) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < vowels.length; i++) {
            char c = vowels[i];
            path.add(c);
            backtrack(ans, path, vowels, i, n);
            path.removeLast();
        }
    }
}