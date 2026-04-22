class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            for (String s : dictionary) {
                if (isClose(query, s)) {
                    ans.add(query);
                    break;
                }
            }
        }
        return ans;
    }

    private static boolean isClose(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) counter++;
            if (counter > 2) return false;
        }
        return true;
    }
}