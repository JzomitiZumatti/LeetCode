class Solution {
    public int percentageLetter(String s, char letter) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) counter++;
        }
        double d = (double) counter / s.length();
        return (int) (d * 100);
    }
}