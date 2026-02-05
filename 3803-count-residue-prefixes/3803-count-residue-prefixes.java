class Solution {
    public int residuePrefixes(String s) {
        int counter = 0;
        Set<Character> unique = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            list.add(c);
            unique.add(c);
            if (unique.size() == list.size() % 3) counter++;
        }
        return counter;
    }
}