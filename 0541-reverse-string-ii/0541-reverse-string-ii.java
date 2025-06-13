class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder rev = new StringBuilder();

        int length = s.length();
        int arraySize = (int) Math.ceil((double) length / (2 * k));
        String[] result = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int start = i * 2 * k;
            int end = Math.min(start + (2 * k), length);
            result[i] = s.substring(start, end);
        }

        int i = 0;
        while (i < result.length) {
            if (result[i].length() < k) {
                for (int j = result[i].length() - 1; j >= 0; j--) {
                    rev.append(result[i].charAt(j));
                }
                i++;
            } else {
                for (int j = k - 1; j >= 0; j--) {
                    rev.append(result[i].charAt(j));
                }
                for (int j = k; j < result[i].length(); j++) {
                    rev.append(result[i].charAt(j));
                }
                i++;
            }
        }
        return rev.toString();
    }
}