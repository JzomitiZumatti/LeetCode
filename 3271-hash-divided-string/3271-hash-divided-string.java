class Solution {
    public String stringHash(String s, int k) {
        String[] arr = new String[s.length() / k];
        int i = 0;
        int start = 0;
        int end = start + k;
        while (end <= s.length()) {
            arr[i] = s.substring(start, end);
            start = end;
            end = start + k;
            i++;
        }
        StringBuilder ans = new StringBuilder();
        for (String string : arr) {
            int sum = 0;
            for (int j = 0; j < string.length(); j++) {
                sum += string.charAt(j) - 'a';
            }
            sum %= 26;
            char c = (char) (sum + 'a');
            ans.append(c);
        }
        return ans.toString();
    }
}