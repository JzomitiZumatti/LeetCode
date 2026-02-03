class Solution {
    public boolean isTrionic(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (isStrictlyIncreasing1(nums, i) && isStrictlyDecreasing(nums, i, j)
                        && isStrictlyIncreasing2(nums, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isStrictlyIncreasing1(int[] arr, int i) {
        if (i < 1) return false;
        for (int k = 1; k <= i; k++) {
            if (arr[k - 1] >= arr[k]) return false;
        }
        return true;
    }

    private static boolean isStrictlyDecreasing(int[] arr, int i, int j) {
        if (j - i < 1) return false;
        for (int k = i + 1; k <= j; k++) {
            if (arr[k - 1] <= arr[k]) return false;
        }
        return true;
    }

    private static boolean isStrictlyIncreasing2(int[] arr, int j) {
        if (arr.length - j < 2) return false;
        for (int k = j + 1; k < arr.length; k++) {
            if (arr[k - 1] >= arr[k]) return false;
        }
        return true;
    }
}