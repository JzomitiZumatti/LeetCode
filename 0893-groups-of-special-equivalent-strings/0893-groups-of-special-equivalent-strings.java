class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<Integer> ans = new HashSet<>();
        for (String word : words) {
            int[] freq = new int[52];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    freq[c - 'a']++;
                } else freq[c - 'a' + 26]++;
            }
            ans.add(Arrays.hashCode(freq));
        }
        return ans.size();
    }
}