class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        Stack<Character> sd = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ')') sd.add(c);
            else {
                char t = sd.pop();
                while (t != '(') {
                    temp.append(t);
                    t = sd.pop();
                }
                for (int j = 0; j < temp.length(); j++) {
                    sd.add(temp.charAt(j));
                }
                temp.setLength(0);
            }
        }
        while (!sd.isEmpty()) {
            char c = sd.pop();
            ans.append(c);
        }
        return ans.reverse().toString();
    }
}