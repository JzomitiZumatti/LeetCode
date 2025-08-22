class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            int left = 0;
            int right = w.length() - 1;

            boolean flag = true;
            while (left < right) {
                if (w.charAt(left) != w.charAt(right)) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
            if (flag) return w;
        }
        return "";
    }
}