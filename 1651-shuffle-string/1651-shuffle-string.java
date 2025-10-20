class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Character> posChar = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            posChar.put(indices[i], s.charAt(i));
        }
        for (int i = 0; i < indices.length; i++) {
            stringBuilder.append(posChar.get(i));
        }
        return stringBuilder.toString();
    }
}