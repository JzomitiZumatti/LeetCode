class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int counter = numBottles;
        while (numBottles >= numExchange) {
            int temp = numBottles % numExchange;
            counter += numBottles / numExchange;
            numBottles /= numExchange;
            numBottles += temp;
        }
        return counter;
    }
}