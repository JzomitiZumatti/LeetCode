class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[50];
        for (int num : nums) {
            freq[num - 1]++;
        }
        int ans = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) ans ^= (i + 1);
        }
        return ans;
    }
}