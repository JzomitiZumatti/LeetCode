class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> sCharPos = new HashMap<>();
        Map<Character, Integer> tCharPos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sCharPos.put(s.charAt(i), i);
            tCharPos.put(t.charAt(i), i);
        }

        int permDif = 0;
        for (Character c : sCharPos.keySet()) {
            permDif += Math.abs(sCharPos.get(c) - tCharPos.get(c));
        }
        return permDif;
    }
}