class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (isOpen(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (getIndex(stack.peek()) == getIndex(current)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpen(Character c) {
        char[] openBr = {'(', '[', '{'};
        for (int i = 0; i < openBr.length; i++) {
            if (c == openBr[i]) {
                return true;
            }
        }
        return false;
    }

    public static int getIndex(Character c) {
        char[] openBr = {'(', '[', '{'};
        char[] closeBr = {')', ']', '}'};
        int index = -1;
        if (isOpen(c)) {
            for (int i = 0; i < openBr.length; i++) {
                if (c == openBr[i]) {
                    index = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < closeBr.length; i++) {
                if (c == closeBr[i]) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}