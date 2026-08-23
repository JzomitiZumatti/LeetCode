class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String binaryStr = Integer.toBinaryString(s.charAt(i) & 0xFF);
            String padded = String.format("%8s", binaryStr).replace(' ', '0');
            str.append(padded);
        }
        System.out.println(str);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (l != r) return false;
            left++;
            right--;
        }
        return true;
    }
}