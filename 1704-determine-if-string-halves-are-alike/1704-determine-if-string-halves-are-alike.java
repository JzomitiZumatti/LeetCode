class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> vovList = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Set<Character> vovel = new HashSet<>(vovList);
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2 && vovel.contains(s.charAt(i))) left++;
            if (i >= s.length() / 2 && vovel.contains(s.charAt(i))) right++;
        }
        return left == right;
    }
}