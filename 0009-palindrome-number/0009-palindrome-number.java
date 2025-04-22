class Solution {
    public boolean isPalindrome(int x) {
        String numb = String.valueOf(x);
        boolean result = true;
        if (numb.length() % 2 == 0) {
            for (int i = 0, j = numb.length() - 1; i < numb.length() / 2 && j >= numb.length() / 2; i++, j--) {
                if (numb.charAt(i) != numb.charAt(j)) {
                    result = false;
                    break;
                }
            }
        } else {
            for (int i = 0, j = numb.length() - 1; i < (numb.length() - 1) / 2 && j > (numb.length() - 1) / 2; i++, j--) {
                if (numb.charAt(i) != numb.charAt(j)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}