class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sTCorresponding = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!sTCorresponding.containsKey(c1)) {
                if (!isUsed(sTCorresponding, c2)) sTCorresponding.put(c1, c2);
                else return false;
            }
            else {
                if (!sTCorresponding.get(c1).equals(c2)) return false;
            }
        }
        return true;
    }

    private static boolean isUsed(Map<Character, Character> map, char c) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue() == c) return true;
        }
        return false;
    }
}