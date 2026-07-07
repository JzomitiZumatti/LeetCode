class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        int[] arr = new int[100];
        for (int num : nums) {
            arr[num - 1]++;
        }
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = 2 < nums.length ? 2 : nums.length - 1;
        if (isUnique(arr)) return ans;
        while (!isUnique(arr)) {
            for (int i = left; i <= right; i++) {
                arr[nums[i] - 1]--;
            }
            ans++;
            if (isUnique(arr)) return ans;
            else {
                left = right + 1;
                right = right + 3 < nums.length ? right + 3 : nums.length - 1;
            }
        }
        return ans;
    }

    private static boolean isUnique(int[] arr) {
        for (int a : arr) {
            if (a > 1) return false;
        }
        return true;
    }
}