class Solution {
    public String reformat(String s) {
        if (isAlreadyFormated(s)) return s;
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) numbers.add(c);
            else letters.add(c);
        }
        if (letters.isEmpty() || numbers.isEmpty()) return "";
        if (Math.abs(letters.size() - numbers.size()) > 1) return "";
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> a = numbers.size() >= letters.size() ? numbers : letters;
        List<Character> b = numbers.size() >= letters.size() ? letters : numbers;
        for (int i = 0; i < a.size(); i++) {
            stringBuilder.append(a.get(i));
            if (i < b.size()) {
                stringBuilder.append(b.get(i));
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isAlreadyFormated(String s) {
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
        return isGood;
    }
}