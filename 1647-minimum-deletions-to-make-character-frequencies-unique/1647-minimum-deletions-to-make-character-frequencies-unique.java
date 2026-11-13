class Solution {
    public int minDeletions(String s) {
        int ans = 0;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        Set<Integer> un = new HashSet<>();
        for (int i = freq.length - 1; i >= 0; i--) {
            int f = freq[i];
            while (f > 0 && un.contains(f)) {
                f--;
                ans++;
            }
            if (f > 0) un.add(f);
        }
        return ans;
    }
}