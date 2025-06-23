class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        int j = 0;
        int i = 0;
        while (j < arr.length) {
            int next = j + 1 < arr.length ? j + 1 : j;
            if (arr[i] == 0) {
                arrCopy[j] = 0;
                arrCopy[next] = 0;
                j += 2;
            } else {
                arrCopy[j] = arr[i];
                j++;
            }
            i++;
        }
        
        for (int k = 0; k < arr.length; k++) {
            arr[k] = arrCopy[k];
        }
    }
}