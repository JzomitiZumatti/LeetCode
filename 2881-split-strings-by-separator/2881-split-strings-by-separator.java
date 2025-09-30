import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            String[] parts = word.split(Pattern.quote(String.valueOf(separator)));
            for (String p : parts) {
                if (!p.isEmpty()) {
                    list.add(p);
                }
            }
        }
        return list;
    }
}