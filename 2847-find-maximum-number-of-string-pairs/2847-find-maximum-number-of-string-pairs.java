class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> revWords = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String rev = "" + word.charAt(1) + word.charAt(0);
            if (revWords.contains(rev)) {
                count++;
            } else {
                revWords.add(word);
            }
        }
        return count;
    }
}