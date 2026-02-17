class Solution {
    public String reformat(String s) {
        char first = s.charAt(0);
        boolean isGood = true;
        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(first) && Character.isDigit(s.charAt(i))) {
                isGood = false;
                break;
            }
            if (!Character.isDigit(first) && !Character.isDigit(s.charAt(i))) {
                isGood = false;
                break;
            }
            first = s.charAt(i);
        }
        if (isGood) return s;
        List<Character> letters = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) numbers.add(Integer.parseInt(String.valueOf(c)));
            else letters.add(c);
        }
        if (letters.isEmpty() || numbers.isEmpty()) return "";
        if (Math.abs(letters.size() - numbers.size()) > 1) return "";
        StringBuilder stringBuilder = new StringBuilder();
        boolean numberIsLonger = numbers.size() >= letters.size();
        int i = 0;
        int j = 0;
        while (i < numbers.size() || j < letters.size()) {
            if (numberIsLonger) {
                if (i < numbers.size()) {
                    stringBuilder.append(numbers.get(i++));
                }
                if (j < letters.size()) {
                    stringBuilder.append(letters.get(j++));
                }
            } else {
                if (j < letters.size()) {
                    stringBuilder.append(letters.get(j++));
                }
                if (i < numbers.size()) {
                    stringBuilder.append(numbers.get(i++));
                }
            }
        }
        return stringBuilder.toString();
    }
}