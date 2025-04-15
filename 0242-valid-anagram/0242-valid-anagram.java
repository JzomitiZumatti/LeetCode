class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            letters.add(t.charAt(i));
        }
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < letters.size(); j++) {
                if (s.charAt(i) == letters.get(j)) {
                    letters.remove(j);
                    counter++;
                    break;
                }
            }
        }
        return counter == s.length() && counter == t.length();
    }
}