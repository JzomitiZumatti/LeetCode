class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                int pos = word.charAt(i) - 97;
                sum += weights[pos];
            }
            sum %= 26;
            char c = (char) ('z' - sum);
            ans.append(c);
        }
        return ans.toString();
    }
}