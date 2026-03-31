class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int k = 0;
        while (k < l.length) {
            int[] arr = new int[r[k] - l[k] + 1];
            int j = 0;
            for (int i = l[k]; i <= r[k]; i++) {
                arr[j] = nums[i];
                j++;
            }
            Arrays.sort(arr);
            int diffPrev = 0;
            boolean isEquals = true;
            for (int i = 1; i < arr.length; i++) {
                int diff = Math.abs(arr[i] - arr[i - 1]);
                if (i > 1) {
                    if (diff != diffPrev) {
                        isEquals = false;
                        break;
                    }
                }
                diffPrev = diff;
            }
            ans.add(isEquals);
            k++;
        }
        return ans;
    }
}