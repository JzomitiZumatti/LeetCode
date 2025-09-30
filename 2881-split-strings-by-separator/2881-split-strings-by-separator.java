class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            int i = 0;
            flush(stringBuilder, list);
            while (i < word.length()) {
                if (word.charAt(i) != separator) {
                    stringBuilder.append(word.charAt(i));
                } else {
                    flush(stringBuilder, list);
                }
                i++;
            }
        }
        flush(stringBuilder, list);
        return list;
    }

    private static void flush(StringBuilder sb, List<String> list) {
        if (!sb.isEmpty()) {
            list.add(sb.toString());
            sb.setLength(0);
        }
    }
}