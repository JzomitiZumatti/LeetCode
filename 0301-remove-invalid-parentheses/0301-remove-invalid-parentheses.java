class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<List<Character>> res = new HashSet<>();
        List<Character> path = new ArrayList<>();
        int index = 0;
        int currRemoved = 0;
        backtrack(index, currRemoved, minToDelete(s), s, res, path);
        List<String> ans = new ArrayList<>();
        for (List<Character> re : res) {
            ans.add(toString(re));
        }
        return ans;
    }

    private static void backtrack(int index, int currRemoved, int maxRemoved, String s, Set<List<Character>> res, List<Character> path) {
        if (index == s.length()) {
            if (currRemoved == maxRemoved && isValid(path)) res.add(new ArrayList<>(path));
            return;
        }
        char c = s.charAt(index);
        path.add(c);
        backtrack(index + 1, currRemoved, maxRemoved, s, res, path);
        path.removeLast();

        if (currRemoved < maxRemoved && (c == '(' || c == ')')) backtrack(index + 1, currRemoved + 1, maxRemoved, s, res, path);
    }

    private static int minToDelete(String s) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            }
            if (c == ')') {
                if (open > 0) open--;
                else close++;
            }
        }
        return open + close;
    }

    private static boolean isValid(List<Character> brackets) {
        int open = 0;
        int close = 0;
        for (Character bracket : brackets) {
            if (bracket == '(') open++;
            if (bracket == ')') close++;
            if (close > open) return false;
        }
        return open == close;
    }

    private static String toString(List<Character> list) {
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}