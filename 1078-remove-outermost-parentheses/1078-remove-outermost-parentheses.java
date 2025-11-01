class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        int leftCounter = 0;   //)
        int rightCounter = 0; //(
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                leftCounter++;
                stringBuilder.append(s.charAt(i));
            } else {
                rightCounter++;
                stringBuilder.append(s.charAt(i));
            }
            if (leftCounter == rightCounter) {
                list.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                leftCounter = 0;
                rightCounter = 0;
            }
        }
        for (String string : list) {
            if (string.length() >= 2) {
                stringBuilder.append(string, 1, string.length() - 1);
            } else stringBuilder.append(string);
        }

        return stringBuilder.toString();
    }
}