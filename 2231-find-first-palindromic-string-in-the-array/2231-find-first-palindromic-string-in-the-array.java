class Solution {
    public String firstPalindrome(String[] words) {
        String res = "";
        for (String w : words) {
            int left = 0;
            int right = w.length() - 1;
            if (w.length() == 1) {
                res = w;
                break;
            } else {
                int counter = 0;
                while (left < right) {
                    if (w.charAt(left) != w.charAt(right)) {
                        break;
                    } else {
                        counter++;
                    }
                    left++;
                    right--;
                }
                if (counter == w .length() / 2) {
                    res = w;
                }
            }
            if (!res.isEmpty()) break;
        }
        return res;
    }
}