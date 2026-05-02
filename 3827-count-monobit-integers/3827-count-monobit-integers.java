class Solution {
    public int countMonobit(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            Set<Character> un = new HashSet<>();
            for (int j = 0; j < binary.length(); j++) {
                un.add(binary.charAt(j));
            }
            if (un.size() == 1) ans++;
        }
        return ans;
    }
}