class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String ans = "aaaaaaaaaaaaaaaaaaaaaaa";
        int[] plateFreq = new int[26];
        licensePlate = licensePlate.toLowerCase();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) plateFreq[licensePlate.charAt(i) - 'a']++;
        }
        for (String word : words) {
            int[] wordFreq = Arrays.copyOf(plateFreq, 26);
            boolean passed = true;
            for (int i = 0; i < word.length(); i++) {
                wordFreq[word.charAt(i) - 'a']--;
            }
            for (int i : wordFreq) {
                if (i > 0) {
                    passed = false;
                    break;
                }
            }
            if (passed) {
                if (word.length() < ans.length()) ans = word;
            }
        }
        return ans;
    }
}