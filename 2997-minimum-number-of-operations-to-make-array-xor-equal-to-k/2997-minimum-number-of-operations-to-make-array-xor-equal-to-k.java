class Solution {
    public int minOperations(int[] nums, int k) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        if (x == k) return 0;
        int totalBits = Math.max(Integer.toBinaryString(k).length(), Integer.toBinaryString(x).length());
        String need = String.format("%" + totalBits + "s", Integer.toBinaryString(k)).replace(' ', '0');
        String have = String.format("%" + totalBits + "s", Integer.toBinaryString(x)).replace(' ', '0');
        int counter = 0;
        for (int i = 0; i < need.length(); i++) {
            char nC = need.charAt(i);
            char hC = have.charAt(i);
            if (nC != hC) counter++;
        }
        return counter;
    }
}