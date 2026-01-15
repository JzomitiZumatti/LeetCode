class Solution {
    public String freqAlphabets(String s) {
        Map<String, Character> rev = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        int a = 1;
        char spec = '#';
        for (char letter ='a'; letter <= 'z'; letter++) {
            if (a < 10) stringBuilder.append(a);
            else stringBuilder.append(a).append(spec);
            rev.put(stringBuilder.toString(), letter);
            stringBuilder.setLength(0);
            a++;
        }
        stringBuilder.setLength(0);
        for (int i = s.length() - 1; i >= 0;) {
            if (s.charAt(i) == '#') {
                stringBuilder.append(rev.get(s.substring(i - 2, i + 1)));
                i -= 3;
            } else {
                stringBuilder.append(rev.get(String.valueOf(s.charAt(i))));
                i--;
            }
        }
        return stringBuilder.reverse().toString();
    }
}