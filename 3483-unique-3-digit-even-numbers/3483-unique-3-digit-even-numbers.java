class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> unique = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            stringBuilder.append(digits[i]);
            for (int j = 0; j < digits.length; j++) {
                if (j == i) continue;
                else stringBuilder.append(digits[j]);
                for (int k = 0; k < digits.length; k++) {
                    if (k == j || k == i) continue;
                    else stringBuilder.append(digits[k]);
                    int n = Integer.parseInt(stringBuilder.toString());
                    if (n % 2 == 0 && stringBuilder.charAt(0) != '0') unique.add(n);
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                stringBuilder.delete(1, 2);
            }
            stringBuilder.setLength(0);
        }
        return unique.size();
    }
}