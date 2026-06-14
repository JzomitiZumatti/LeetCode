class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                char prev = stack.peek();
                if (Math.abs(prev - c) == 32) {
                    stack.pop();
                } else stack.push(c);
            } else stack.push(c);

        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}