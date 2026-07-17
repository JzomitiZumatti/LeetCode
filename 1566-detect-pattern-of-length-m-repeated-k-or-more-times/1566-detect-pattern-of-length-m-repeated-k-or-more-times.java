class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int counter = 0;
        for (int i = 0; i < arr.length - m; i++) {
            if (arr[i] == arr[i + m]) counter++;
            else counter = 0;
            if (counter >= (k - 1) * m) return true;
        }
        return false;
    }
}