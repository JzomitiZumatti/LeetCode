class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c = s.charAt(0); c <= s.charAt(3); c++) {
            stringBuilder.append(c);
            for (int i = s.charAt(1) - '0'; i <= s.charAt(4) - '0'; i++) {
                stringBuilder.append(i);
                ans.add(stringBuilder.toString());
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.setLength(0);
        }
        return ans;
    }
}