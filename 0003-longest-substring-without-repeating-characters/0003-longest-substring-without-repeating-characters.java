class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        Set<Character> unique = new HashSet<>();
        while (i < s.length()) {
            unique.clear();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (unique.contains(c)) break;
                else unique.add(c);
            }
            max = Math.max(max, unique.size());
            i++;
        }
        return max;
    }
}