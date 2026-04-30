class Solution {
    public String reverseByType(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> symb = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) letters.add(c);
            else symb.add(c);
        }
        StringBuilder ans = new StringBuilder();
        int i = letters.size() - 1;
        int j = symb.size() - 1;
        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            if (Character.isAlphabetic(c)) {
                ans.append(letters.get(i));
                i--;
            } else {
                ans.append(symb.get(j));
                j--;
            }
        }
        return ans.toString();
    }
}