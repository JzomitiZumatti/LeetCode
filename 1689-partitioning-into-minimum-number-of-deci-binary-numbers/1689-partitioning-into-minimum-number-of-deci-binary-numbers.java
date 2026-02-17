class Solution {
    public int minPartitions(String n) {
        int max = -1;
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(max, n.charAt(i));
        }
        return Integer.parseInt(String.valueOf((char) max));
    }
}