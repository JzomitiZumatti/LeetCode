class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ']') {
                stack.add(c);
            } else {
                while (stack.peek() != '[') {
                    stringBuilder.append(stack.pop());
                }
                stack.pop();
                String temp = stringBuilder.reverse().toString();
                StringBuilder number = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    number.append(stack.pop());
                }
                stringBuilder.setLength(0);
                stringBuilder.repeat(temp, Integer.parseInt(number.reverse().toString()));
                number.setLength(0);
                    for (int j = 0; j < stringBuilder.length(); j++) {
                        char ch = stringBuilder.charAt(j);
                        stack.add(ch);
                    }
                    stringBuilder.setLength(0);
            }
        }
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}