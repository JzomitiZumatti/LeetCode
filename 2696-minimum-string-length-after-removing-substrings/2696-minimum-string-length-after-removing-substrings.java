class Solution {
    public int minLength(String s) {
        Stack<Character> ans = new Stack<>();
        char[] arr = s.toCharArray();
        for (char b : arr) {
            if (!ans.isEmpty()) {
                char a = ans.peek();
                if ((a == 'A' && b == 'B') || (a == 'C' && b == 'D')) {
                    ans.pop();
                } else ans.add(b);
            } else ans.add(b);
        }
        return ans.size();
    }
}