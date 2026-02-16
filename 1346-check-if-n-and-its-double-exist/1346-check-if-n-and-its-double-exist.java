class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                int b = arr[j];
                if (j != i && a == 2 * b) return true;
            }
        }
        return false;
    }
}