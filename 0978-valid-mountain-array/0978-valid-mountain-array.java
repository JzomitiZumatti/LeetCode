class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 0;
        boolean flag = true;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1] && flag) {
                i++;
                if (i == arr.length - 1) {
                    return false;
                }
            } else if (arr[i] > arr[i + 1] && i > 0) {
                flag = false;
                i++;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            } else {
                return false;
            }
        }
        return i == arr.length - 1 || !flag;
    }
}