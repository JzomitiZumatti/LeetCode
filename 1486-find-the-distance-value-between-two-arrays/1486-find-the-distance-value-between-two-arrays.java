class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int k : arr1) {
            int counter = 0;
            for (int i : arr2) {
                if (Math.abs(k - i) > d) counter++;
            }
            if (counter == arr2.length) res++;
        }
        return res;
    }
}