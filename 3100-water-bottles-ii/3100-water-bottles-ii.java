class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            emptyBottles = emptyBottles + 1 - numExchange;
            numExchange++;
            ans++;
        }
        return ans;
    }
}