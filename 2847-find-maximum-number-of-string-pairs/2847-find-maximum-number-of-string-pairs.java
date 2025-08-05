class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]) || words[i].contentEquals(new StringBuilder().append(words[j]).reverse())) {
                    System.out.println(words[j]);
                    counter++;
                }
            }
        }
        return counter;
    }
}