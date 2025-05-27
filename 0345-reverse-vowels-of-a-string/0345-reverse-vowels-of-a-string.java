class Solution {
    public String reverseVowels(String s) {
        Map<String, String> vowels = new HashMap<>();
        vowels.put("a", "A");
        vowels.put("e", "E");
        vowels.put("i", "I");
        vowels.put("o", "O");
        vowels.put("u", "U");
        StringBuilder reverse = new StringBuilder();
        List<String> vowelsLetters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            if (isVowel(vowels, letter)) {
                vowelsLetters.add(letter);
            }
        }
        System.out.println(vowelsLetters);
        int j = vowelsLetters.size() - 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            if (isVowel(vowels, letter)) {
                reverse.append(vowelsLetters.get(j));
                j--;
            } else {
                reverse.append(letter);
            }
        }
        return reverse.toString();
    }

    public static boolean isVowel(Map<String, String> vowels, String s) {
        return vowels.containsKey(s) || vowels.containsValue(s);
    }
}