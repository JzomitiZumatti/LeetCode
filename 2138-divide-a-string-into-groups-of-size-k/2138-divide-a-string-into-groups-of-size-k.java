class Solution {
    public String[] divideString(String s, int k, char fill) {
        int length = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        String[] arr = new String[length];
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (stringBuilder.length() < k) stringBuilder.append(s.charAt(i));
            else {
                if (stringBuilder.length() == k) {
                    arr[j] = stringBuilder.toString();
                    j++;
                    stringBuilder.setLength(0);
                    stringBuilder.append(s.charAt(i));
                }
            }
        }
        if (!stringBuilder.isEmpty()) {
            while (stringBuilder.length() < k) {
                stringBuilder.append(fill);
            }
        }
        arr[j] = stringBuilder.toString();
        return arr;
    }
}