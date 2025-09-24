class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (i % 2 != 0) counter++;
            else counter = 0;
            if(counter == 3) return true;
        }
        return false;
    }
}