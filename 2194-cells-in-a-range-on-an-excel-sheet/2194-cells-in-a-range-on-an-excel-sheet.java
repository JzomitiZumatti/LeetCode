class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        for (char c = s.charAt(0); c <= s.charAt(3); c++) {
            for (int i = s.charAt(1) - '0'; i <= s.charAt(4) - '0'; i++) {
                ans.add(c + String.valueOf(i));
            }
        }
        return ans;
    }
}