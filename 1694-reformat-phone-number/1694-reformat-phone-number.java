class Solution {
    public String reformatNumber(String number) {
        Stack<Integer> digits = new Stack<>();
        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);
            if (Character.isDigit(c)) digits.add(c - '0');
        }
        StringBuilder ans = new StringBuilder();
        while (!digits.isEmpty()) {
            if (digits.size() == 4) {
                int i = 0;
                while (i < 4) {
                    ans.append(digits.pop());
                    i++;
                    if (i == 2) ans.append("-");
                }
            } else if (digits.size() >= 3) {
                int i = 0;
                while (i < 3) {
                    ans.append(digits.pop());
                    i++;
                }
            } else if (digits.size() == 2) {
                int i = 0;
                while (i < 2) {
                    ans.append(digits.pop());
                    i++;
                }
            }
            if (!digits.isEmpty()) ans.append("-");
        }
        return ans.toString();
    }
}