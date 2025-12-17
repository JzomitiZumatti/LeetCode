class Solution {
    public int fillCups(int[] amount) {
        int sum = 0;
        while (amount[0] > 0 || amount[1] > 0 || amount[2] > 0) {
            Arrays.sort(amount);
            int counter = 0;
            for (int i = amount.length - 1; i >= 0; i--) {
                if (amount[i] > 0 && counter < 2) {
                    amount[i] = amount[i] - 1;
                    counter++;
                }
            }
            sum++;
        }
        return sum;
    }
}