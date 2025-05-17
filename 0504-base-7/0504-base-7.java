class Solution {
    public String convertToBase7(int num) {
        String s = "";
        boolean isPositive = num < 0;
        if (isPositive) {
            num = num * -1;
        }
        do {
            if (num / 7 != 0) {
                int left = num % 7;
                num = num / 7;
                s += String.valueOf(left);
            } else {
                s += String.valueOf(num % 7);
                break;
            }
        } while (true);
        if (isPositive){
            s += "-";
        }
        return new StringBuilder(s).reverse().toString();
    }
}