class Solution {
    public int minMaxDifference(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        String number = stringBuilder.toString();
        int maxreplace = -1;
        int minreplace = -1;
        for (int i = 0; i < number.length(); i++) {
            int parseInt = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (parseInt < 9) {
                maxreplace = parseInt;
                break;
            }
        }
        for (int i = 0; i < number.length(); i++) {
            int parseInt = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (parseInt > 0) {
                minreplace = parseInt;
                break;
            }
        }
        stringBuilder.setLength(0);
        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(String.valueOf(number.charAt(i))) != maxreplace) stringBuilder.append(number.charAt(i));
            else stringBuilder.append(9);
        }
        int max = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);
        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(String.valueOf(number.charAt(i))) != minreplace) stringBuilder.append(number.charAt(i));
            else stringBuilder.append(0);
        }
        int min = Integer.parseInt(stringBuilder.toString());

        return max - min;
    }
}