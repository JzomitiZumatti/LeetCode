class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int previous = 0;
        for (String s : bank) {
            int current = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '1') current++;
            }
            if (previous > 0 && current > 0) res += previous * current;
            if (current > 0) previous = current;
        }
        return res;
    }
}