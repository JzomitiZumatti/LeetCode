class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int a : arr) totalSum += a;

        if (totalSum % 3 != 0) return false;

        int target = totalSum / 3;
        int left = 0, right = arr.length - 1;
        int leftSum = arr[left], rightSum = arr[right];

        while (left + 1 < right) {
            if (leftSum != target) {
                left++;
                leftSum += arr[left];
            }
            if (rightSum != target) {
                right--;
                rightSum += arr[right];
            }

            if (leftSum == target && rightSum == target && left + 1 < right) {
                return true;
            }
        }
        return false;
    }
}