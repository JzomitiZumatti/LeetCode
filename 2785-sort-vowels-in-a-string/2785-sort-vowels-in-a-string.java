class Solution {
    public String sortVowels(String s) {
        List<Character> list = List.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        Set<Character> vovels = new HashSet<>(list);
        List<Character> unsorted = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vovels.contains(c)) unsorted.add(c);
        }
        Collections.sort(unsorted);
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vovels.contains(c)) {
                ans.append(unsorted.get(j));
                j++;
            }
            else ans.append(c);
        }
        return ans.toString();
    }
}