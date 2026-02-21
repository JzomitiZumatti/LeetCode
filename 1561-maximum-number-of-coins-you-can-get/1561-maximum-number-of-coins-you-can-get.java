class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int left = 0;
        int right = piles.length - 1;
        while (left < right) {
            left++;
            right--;
            sum += piles[right--];
        }
        return sum;
    }
}