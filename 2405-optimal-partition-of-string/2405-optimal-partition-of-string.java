class Solution {
    public int partitionString(String s) {
        int ans = 0;
        Set<Character> un = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!un.contains(c)) un.add(c);
            else {
                ans++;
                un.clear();
                un.add(c);
            }
        }
        if (!un.isEmpty()) ans++;
        return ans;
    }
}