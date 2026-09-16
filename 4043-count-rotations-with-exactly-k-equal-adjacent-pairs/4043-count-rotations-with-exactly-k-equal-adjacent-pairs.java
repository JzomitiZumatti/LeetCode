class Solution {
    public int countRotations(String s, int k) {
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        int i = 0;
        while (i < s.length()) {
            int score = countPairs(stringBuilder.toString());
            if (score == k) ans++;
            char temp = stringBuilder.charAt(0);
            stringBuilder.deleteCharAt(0);
            stringBuilder.append(temp);
            i++;
        }
        return ans;
    }

    private static int countPairs(String str) {
        int ans = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) ans++;
        }
        return ans;
    }
}