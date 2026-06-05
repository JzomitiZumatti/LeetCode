class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        int i = 0;
        while (i < s.length()) {
            int[] curr = Arrays.copyOf(startPos, 2);
            int counter = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'R') {
                    if (curr[1] + 1 < n) {
                        curr[1]++;
                        counter++;
                    } else break;
                } else if (c == 'L') {
                    if (curr[1] - 1 >= 0) {
                        curr[1]--;
                        counter++;
                    } else break;
                } else if (c == 'D') {
                    if (curr[0] + 1 < n) {
                        curr[0]++;
                        counter++;
                    }
                    else break;
                } else if (c == 'U') {
                    if (curr[0] - 1 >= 0) {
                        curr[0]--;
                        counter++;
                    } else break;
                }
            }
            ans[i] = counter;
            i++;
        }
        return ans;
    }
}