class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.add(c);
            if (c == '(') depth++;
            else {
                char temp = stack.pop();
                char prev = stack.peek();
                if (prev == '(') score += (int) Math.pow(2, depth - 1);
                depth--;
                stack.add(temp);
            }
        }
        return score;
    }
}