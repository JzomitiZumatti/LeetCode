class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = Map.of(
        ')', '(', 
        ']', '[', 
        '}', '{'
    );

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (brackets.containsValue(c)) {
            stack.push(c);
        } else if (brackets.containsKey(c)) {
            if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                return false;
            }
        } else {
            return false;
        }
    }
    return stack.isEmpty();
    }
}