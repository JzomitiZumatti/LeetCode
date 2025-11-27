class Solution {
    public int minimumPushes(String word) {
        if (word.length() <= 8) return word.length();
        int t = 0;
        int i = 1;
        int res = 0;
        int counter = 0;
        while (t < word.length()) {
            res += i;
            counter++;
            if (counter == 8) {
                counter = 0;
                i++;
            }
            t++;
        }
        return res;
    }
}