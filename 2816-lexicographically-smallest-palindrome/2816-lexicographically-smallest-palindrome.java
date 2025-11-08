class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = s.split("");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                int leftC = s.charAt(left);
                int rightC = s.charAt(right);
                if (leftC > rightC) arr[left] = arr[right];
                else arr[right] = arr[left];
            }
            left++;
            right--;
        }
        for (String c : arr) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}