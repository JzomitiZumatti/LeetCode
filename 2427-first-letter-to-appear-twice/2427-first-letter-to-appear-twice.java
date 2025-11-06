class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> cahrs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (cahrs.contains(s.charAt(i))) return s.charAt(i);
            cahrs.add(s.charAt(i));
        }
        return '!';
    }
}