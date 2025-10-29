class Solution {
    public int getLucky(String s, int k) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            number.append((int) s.charAt(i) - 96);
        }
        int a = 0;
        while (a < k) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Integer.parseInt(String.valueOf(number.toString().charAt(i)));
            }
            number.setLength(0);
            number.append(sum);
            a++;
        }
        return Integer.parseInt(number.toString());
    }
}