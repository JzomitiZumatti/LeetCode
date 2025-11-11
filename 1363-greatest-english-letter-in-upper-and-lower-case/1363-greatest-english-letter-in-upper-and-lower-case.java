class Solution {
    public String greatestLetter(String s) {
        Set<Character> upperCase = new HashSet<>();
        Set<Character> lowerCase = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int letter = s.charAt(i);
            if (letter > 96) lowerCase.add(s.charAt(i));
            else upperCase.add(s.charAt(i));
        }
        int max = -1;
        for (Character c : upperCase) {
            int value = (int) c;
            if (lowerCase.contains(String.valueOf(c).toLowerCase().charAt(0))) {
                max = Math.max(max, value);
            }
        }
        return max == -1 ? "" : String.valueOf((char) max);    
    }
}