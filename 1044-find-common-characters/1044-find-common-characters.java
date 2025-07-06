class Solution {
    public List<String> commonChars(String[] words) {
        int[][] freq = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                freq[i][c - 'a']++;
            }
        }

        int[] minFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
            for (int j = 0; j < words.length; j++) {
                minFreq[i] = Math.min(minFreq[i], freq[j][i]);
            }
        }
        
        List<String> res = new ArrayList<>();
        for (int i = 0; i < minFreq.length; i++) {
            int j = 0;
            while (j < minFreq[i]) {
                res.add(Character.toString(i + 'a'));
                j++;
            }
        }
        return res;
    }
}