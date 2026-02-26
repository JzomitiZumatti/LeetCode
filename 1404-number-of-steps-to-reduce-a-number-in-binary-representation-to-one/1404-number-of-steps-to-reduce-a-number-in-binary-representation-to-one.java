class Solution {
    public int numSteps(String s) {
        int counter = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            int n = s.charAt(i) - '0';
            if (n + carry  == 1) {
                counter += 2;
                carry = 1;
            } else if (n + carry == 2) {
                counter += 1;
            } else if (n + carry == 0) {
                counter++;
            }
        }
        return counter + carry;
    }
}