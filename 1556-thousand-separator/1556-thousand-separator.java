class Solution {
    public String thousandSeparator(int n) {
        String number = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (counter == 3) {
                stringBuilder.append(".");
                stringBuilder.append(number.charAt(i));
                counter = 1;
            } else {
                stringBuilder.append(number.charAt(i));
                counter++;
            }
        }
        return stringBuilder.reverse().toString();
    }
}