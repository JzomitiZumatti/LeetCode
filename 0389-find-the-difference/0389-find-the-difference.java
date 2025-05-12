class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> carT = new ArrayList<>(t.chars().mapToObj(c -> (char) c).toList());
        for (int i = 0; i < s.length(); i++) {
            carT.remove((Character)s.charAt(i));
        }
        return carT.getFirst();
    }
}