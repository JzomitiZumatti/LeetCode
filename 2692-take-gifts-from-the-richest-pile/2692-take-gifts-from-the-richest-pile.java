class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res = 0L;
        int counter = 0;
        while (counter <= k) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < gifts.length; i++) {
                if (gifts[i] > max) {
                    max = gifts[i];
                    maxIndex = i;
                }
            }
            counter++;
            if (counter <= k) gifts[maxIndex] = (int) Math.sqrt(max);
        }
        for (int gift : gifts) {
            res += gift;
        }
        return res;
    }
}