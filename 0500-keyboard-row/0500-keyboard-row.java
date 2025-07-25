class Solution {
    public String[] findWords(String[] words) {
        List<String> oneLine = new ArrayList<>();
        Set<String> firstLine = new HashSet<>(Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p"));
        Set<String> secondLine = new HashSet<>(Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l"));
        Set<String> thirdLine = new HashSet<>(Arrays.asList("z", "x", "c", "v", "b", "n", "m"));
        for (String w : words) {
            boolean first = true;
            boolean second = true;
            boolean third = true;
            int counter = 0;
            String firstChar = String.valueOf(w.charAt(0)).toLowerCase();
            if (firstLine.contains(firstChar)) {
                counter++;
                second = false;
                third = false;
            }
            if (secondLine.contains(firstChar)) {
                counter++;
                first = false;
                third = false;
            }
            if (thirdLine.contains(firstChar)) {
                counter++;
                first = false;
                second = false;
            }
            for (int i = 1; i < w.length(); i++) {
                String lowerCase = String.valueOf(w.charAt(i)).toLowerCase();
                if (firstLine.contains(lowerCase) && !second && !third) {
                    counter++;
                }
                if (secondLine.contains(lowerCase) && !first && !third) {
                    counter++;
                }
                if (thirdLine.contains(lowerCase) && !first && !second) {
                    counter++;
                }
            }
            if (counter == w.length()) {
                oneLine.add(w);
            }
        }
        return oneLine.toArray(new String[0]);
    }
}