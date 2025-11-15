class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split("");
            for (int j = 0; j < letters.length; j++) {
                if (letters.length <= 2) {
                    stringBuilder.append(letters[j].toLowerCase());
                } else {
                    if (j == 0) stringBuilder.append(letters[j].toUpperCase());
                    else stringBuilder.append(letters[j].toLowerCase());
                }
            }
            if (i < words.length - 1) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}