class Solution {
    public boolean hasMatch(String s, String p) {
        String[] prefSuf = new String[2];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == '*') {
                prefSuf[0] = str.toString();
                str.setLength(0);
            } else str.append(c);
        }
        prefSuf[1] = str.toString();
        return checker(s, prefSuf);
    }

    private static boolean checker(String s, String[] arr) {
        String pref = arr[0];
        String suf = arr[1];
        if (pref.isEmpty() && suf.isEmpty()) return true;
        else if (pref.isEmpty() && s.contains(suf)) return true;
        else if (suf.isEmpty() && s.contains(pref)) return true;
        else {
            if (s.contains(pref)) {
                int last = s.indexOf(pref) + pref.length();
                return s.substring(last).contains(suf);
            }
        }
        return false;
    }
}