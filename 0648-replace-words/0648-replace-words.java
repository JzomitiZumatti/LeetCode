class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = sentence.split("\s+");
        for (String s : arr) {
            boolean flag = false;
            for (String d : dictionary) {
                if (s.startsWith(d)) {
                    stringBuilder.append(d).append(" ");
                    flag = true;
                    break;
                }
            }
            if (!flag) stringBuilder.append(s).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}