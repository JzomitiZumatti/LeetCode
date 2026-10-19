class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        int start = 0;
        backtracking(s, start, ans, path);
        return ans;
    }

    private static void backtracking(String s, int start, List<List<String>> ans, List<String> path) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);
            if (isPalindrome(sub)) {
                path.add(sub);
                backtracking(s, i + 1, ans, path);
                path.removeLast();
            }
        }
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        else {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                char l = s.charAt(left);
                char r = s.charAt(right);
                if (l != r) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}