class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        Map<Character, Integer> letterPos = new HashMap<>();
        int i = 26;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            letterPos.put(ch, i);
            i--;
        }

        for (int j = 0; j < s.length(); j++) {
            sum += ((j + 1) * letterPos.get(s.charAt(j)));
        }

        return sum;
    }
}