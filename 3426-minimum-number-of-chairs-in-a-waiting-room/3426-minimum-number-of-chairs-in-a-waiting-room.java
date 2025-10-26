class Solution {
    public int minimumChairs(String s) {
        int maxPeoples = Integer.MIN_VALUE;
        int peoples = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                peoples++;
            } else if (s.charAt(i) == 'L') {
                peoples--;
            }
            maxPeoples = Math.max(maxPeoples, peoples);
        }
        return maxPeoples;
    }
}