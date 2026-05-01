class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        int i = 0;
        while (!cur.toString().equals(target)) {
            for (char c = 'a'; c <= 'z'; c++) {
                cur.append(c);
                ans.add(cur.toString());
                if (c == target.charAt(i)) {
                    i++;
                    break;
                } else {
                    cur.deleteCharAt(cur.length() - 1);
                }
            }
        }
        return ans;
    }
}