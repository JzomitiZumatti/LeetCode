class Solution {
    public String reorganizeString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] letterFreq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letterFreq[c -'a']++;
        }
        if (letterFreq[maxFreqElementPos(letterFreq)] > (s.length() + 1) / 2) return "";
        char[] arr = new char[s.length()];
        int j = 0;
        while (letterFreq[maxFreqElementPos(letterFreq)] > 0) {
            char c = (char) (maxFreqElementPos(letterFreq) + 'a');
            while (letterFreq[c - 'a'] > 0) {
                arr[j] = c;
                letterFreq[c - 'a']--;
                j += 2;
                if (j >= arr.length) {
                    j = 1;
                }
            }
        }
        for (char c : arr) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static int maxFreqElementPos(int[] arr) {
        int max = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                pos = i;
            }
        }
        return pos;
    }
}