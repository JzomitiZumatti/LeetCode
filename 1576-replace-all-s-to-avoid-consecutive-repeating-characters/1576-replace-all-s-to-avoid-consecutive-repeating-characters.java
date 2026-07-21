class Solution {
    public String modifyString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '?' && ans.isEmpty() && i + 1 >= s.length()) ans.append('a');
            else if (c == '?' && ans.isEmpty() && i + 1 < s.length()) {
                int right = s.charAt(i + 1) - 'a';
                for (int j = 0; j < 26; j++) {
                    if (j != right) {
                        ans.append((char) (j + 'a'));
                        break;
                    }
                }
            } else if (c == '?'){
                int left = ans.charAt(i - 1) - 'a';
                if (i + 1 < s.length() && s.charAt(i + 1) != '?') {
                    int right = s.charAt(i + 1) - 'a';
                    for (int j = 0; j < 26; j++) {
                        if (j != left && j != right) {
                            ans.append((char) (j + 'a'));
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < 26; j++) {
                        if (j != left) {
                            ans.append((char) (j + 'a'));
                            break;
                        }
                    }
                }
            } else ans.append(c);
        }
        return ans.toString();
    }
}