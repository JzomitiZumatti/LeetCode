class Solution {
    public boolean checkDistances(String s, int[] distance) {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        Map<Character, Integer> letterDistance = new HashMap<>();
        for (int i = 0; i < alphabetString.length(); i++) {
            letterDistance.put(alphabetString.charAt(i), letterDistance.getOrDefault(alphabetString.charAt(i), distance[i]));
        }

        System.out.println(letterDistance);
        for (int i = 0; i < s.length() - 1; i++) {
            int k = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (k == letterDistance.get(s.charAt(i))) break;
                    else return false;
                }
                k++;
            }
        }
        return true;
    }
}