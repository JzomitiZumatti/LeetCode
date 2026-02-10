class Solution {
    public boolean backspaceCompare(String s, String t) {
        boolean[] sB = new boolean[s.length()];
        boolean[] tB = new boolean[t.length()];
        Arrays.fill(sB, true);
        Arrays.fill(tB, true);
        int sCounter = 0;
        int tCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '#') sCounter++;
        }

        for (int i = 0; i < t.length(); i++) {
            char cur = t.charAt(i);
            if (cur == '#') tCounter++;
        }

        while (sCounter > 0) {
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c == '#') {
                    sB[i] = false;
                    sCounter--;
                    for (int j = i; j >= 0; j--) {
                        if (s.charAt(j) != '#' && sB[j]) {
                            sB[j] = false;
                            break;
                        }
                    }
                }
            }
        }

        while (tCounter > 0) {
            for (int i = t.length() - 1; i >= 0; i--) {
                char c = t.charAt(i);
                if (c == '#') {
                    tB[i] = false;
                    tCounter--;
                    for (int j = i; j >= 0; j--) {
                        if (t.charAt(j) != '#' && tB[j]) {
                            tB[j] = false;
                            break;
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sB[i]) stringBuilder.append(s.charAt(i));
        }

        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if (tB[i]) stringBuilder1.append(t.charAt(i));
        }
        return stringBuilder.compareTo(stringBuilder1) == 0;
    }
}