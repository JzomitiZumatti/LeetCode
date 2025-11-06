class Solution {
    public String makeFancyString(String s) {
        Set<Integer> posToDelete = new HashSet<>();
        int counter = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                counter++;
                if (counter > 1) posToDelete.add(i);
            } else counter = 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!posToDelete.contains(i)) stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}