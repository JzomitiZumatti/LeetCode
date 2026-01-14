class Solution {
    public static String smallestNumber(String pattern) {
    int max = pattern.length() + 1;
    int[] arr = new int[max];

    for (int i = 0; i < max; i++) {
        arr[i] = i + 1;
    }

    for (int i = 0; i < pattern.length();) {
        if (pattern.charAt(i) == 'D') {
            int start = i;
            int end = i;

            for (int j = start; j < pattern.length(); j++) {
                if (pattern.charAt(j) == 'I') {
                    break;
                }
                end = j;
            }
            int len = end - start + 2;
            int[] temp = new int[len];

            int k = 0;
            for (int j = start + len - 1; j >= start; j--) {
                temp[k++] = arr[j];
            }

            k = start;
            for (int val : temp) {
                arr[k++] = val;
            }

            i = end + 1;
        } else {
            i++;
        }
    }

    StringBuilder sb = new StringBuilder();
    for (int v : arr) {
        sb.append(v);
    }

    return sb.toString();
}
}