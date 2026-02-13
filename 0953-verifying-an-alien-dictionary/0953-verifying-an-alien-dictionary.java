class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> letterPos = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            letterPos.put(c, i);
        }

        for (int i = 1; i < words.length; i++) {
            if (letterPos.get(words[i - 1].charAt(0)) > letterPos.get(words[i].charAt(0))) return false;
            if (Objects.equals(letterPos.get(words[i - 1].charAt(0)), letterPos.get(words[i].charAt(0)))) {
                int min = Math.min(words[i - 1].length(), words[i].length());
                for (int j = 1; j < min; j++) {
                    if (letterPos.get(words[i - 1].charAt(j)) > letterPos.get(words[i].charAt(j))) return false;
                }
                String sub1 = words[i - 1].substring(0, min);
                String sub2 = words[i].substring(0, min);
                if (sub1.equals(sub2) && words[i].length() < words[i - 1].length()) return false;
            }
        }
        return true;
    }
}