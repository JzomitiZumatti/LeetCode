class Solution {
    public int countSegments(String s) {
         if (s.isEmpty()) return 0;
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                stringBuilder.append(c);
            } else {
                if (!stringBuilder.isEmpty()) list.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        if (!stringBuilder.isEmpty()) list.add(stringBuilder.toString());
        return list.size();
    }
}