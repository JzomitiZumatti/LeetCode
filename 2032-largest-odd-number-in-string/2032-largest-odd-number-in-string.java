class Solution {
    public String largestOddNumber(String num) {
        if ((num.charAt(num.length() - 1) - '0') % 2!= 0) {
            return num;
        }
        StringBuilder n = new StringBuilder(num);
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 0) {
                n.deleteCharAt(n.length() - 1);
            } else {
                break;
            }
        }
        return n.toString();
    }
}