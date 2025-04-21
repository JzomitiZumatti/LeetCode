class Solution {
    public int reverse(int x) {
        StringBuilder buffer;
        int result;
        if (x < 0) {
            buffer = new StringBuilder(String.valueOf(Math.abs(x)));
            try {
                result = Integer.parseInt(buffer.reverse().insert(0, "-").toString());
            } catch (NumberFormatException e) {
                result = 0;
            }
        } else {
            buffer = new StringBuilder(String.valueOf(x));
            try {
                result = Integer.parseInt(buffer.reverse().toString());
            } catch (NumberFormatException e) {
                result = 0;
            }
        }
        return result;
    }
}