class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        String res = "";
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i - 1) == num.charAt(i)) counter++;
            else counter = 0;
            if (counter == 2) {
                stringBuilder.append(String.valueOf(num.charAt(i)).repeat(3));
                if (max < Integer.parseInt(stringBuilder.toString())) {
                    max = Integer.parseInt(stringBuilder.toString());
                    res = stringBuilder.toString();
                }
                stringBuilder.setLength(0);
                counter = 0;
            }
        }
        return res;
    }
}