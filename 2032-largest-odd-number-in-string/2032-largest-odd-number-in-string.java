class Solution {
    public String largestOddNumber(String num) {
        StringBuilder n = new StringBuilder(num);
        System.out.println(n.toString());
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 == 0) {
                n.deleteCharAt(n.length() - 1);
            } else {
                break;
            }
        }
        return n.toString();
    }
}