class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 1;
        int curCap = capacity;
        curCap -= plants[0];
        for (int i = 1; i < plants.length; i++) {
            if (plants[i] <= curCap) {
                ans += 1;
                curCap -= plants[i];
            } else {
                ans += i + i + 1;
                curCap = capacity - plants[i];
            }
        }
        return ans;
    }
}