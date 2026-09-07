class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int prev = 0;
        for (int space : spaces) {
            ans.append(s, prev, space).append(" ");
            prev = space;
        }
        ans.append(s.substring(prev));
        return ans.toString();
    }
}