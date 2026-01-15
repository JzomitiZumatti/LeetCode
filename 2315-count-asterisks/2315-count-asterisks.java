class Solution {
    public int countAsterisks(String s) {
        boolean flag = false;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|' && !flag) flag = true;
            else if (s.charAt(i) == '|' && flag) flag = false;
            else if (s.charAt(i) == '*' && !flag) counter++;
        }
        return counter;
    }
}