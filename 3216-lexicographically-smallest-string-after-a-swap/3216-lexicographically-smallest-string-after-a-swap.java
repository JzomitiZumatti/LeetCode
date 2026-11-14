class Solution {
    public String getSmallestString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (b < a && ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0))) {
                ans.append(s, 0, i).append(b).append(a).append(s.substring(i + 2));
                break;
            }
        }
        return ans.isEmpty() ? s : ans.toString();
    }
}