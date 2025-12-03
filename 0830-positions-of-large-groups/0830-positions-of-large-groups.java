class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> groups = new ArrayList<>();
        int counter = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) counter++;
            else {
                if (counter >= 3) {
                    groups.add(new ArrayList<>(List.of(i - counter, i - 1)));
                }
                counter = 1;
            }
        }
        if (counter >= 3) groups.add(new ArrayList<>(List.of(s.length() - counter, s.length() - 1)));
        return groups;
    }
}