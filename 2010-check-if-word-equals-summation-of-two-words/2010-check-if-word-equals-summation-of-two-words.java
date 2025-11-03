class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Character, Integer> alphabetValue = new HashMap<>();

        int j = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetValue.put(ch, j);
            j++;
        }
        int targetSum = 0;
        int sumOfTwo = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            stringBuilder.append(alphabetValue.get(targetWord.charAt(i)));
        }
        targetSum = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);
        for (int i = 0; i < firstWord.length(); i++) {
            stringBuilder.append(alphabetValue.get(firstWord.charAt(i)));
        }
        sumOfTwo = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);
        for (int i = 0; i < secondWord.length(); i++) {
            stringBuilder.append(alphabetValue.get(secondWord.charAt(i)));
        }
        sumOfTwo += Integer.parseInt(stringBuilder.toString());
        return sumOfTwo == targetSum;
    }
}