class Solution {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0) {
            int i = 0;
            while (i < n - 1) {
                stringBuilder.append('a');
                i++;
            }
            stringBuilder.append('b');
        } else {
            int i = 0;
            while (i < n) {
                stringBuilder.append('a');
                i++;
            }
        }
        return stringBuilder.toString();
    }
}