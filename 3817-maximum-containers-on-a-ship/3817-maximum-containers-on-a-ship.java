class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cells = n * n;
        int counter = 0;
        for (int i = 1; i <= cells; i++) {
            if (w * i <= maxWeight) {
                counter = i;
            } else break;
        }
        return counter;
    }
}