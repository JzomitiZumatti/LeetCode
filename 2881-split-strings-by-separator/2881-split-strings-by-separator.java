class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            int i = 0;
            if (!stringBuilder.isEmpty()) {
                list.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
            while (i < word.length()) {
                if (word.charAt(i) != separator) {
                    stringBuilder.append(word.charAt(i));
                } else {
                    if (!stringBuilder.isEmpty()) {
                        list.add(stringBuilder.toString());
                        stringBuilder.setLength(0);
                    }
                }
                i++;
            }
        }
        if (!stringBuilder.isEmpty()) {
            list.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        return list;
    }
}