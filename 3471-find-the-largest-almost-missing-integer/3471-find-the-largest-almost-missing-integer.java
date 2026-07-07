class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] arr = new int[51];
        Arrays.fill(arr, - 1);
        int start = 0;
        while (start <= nums.length - k) {
            Set<Integer> un = new HashSet<>();
            for (int i = start; i < start + k; i++) {
                un.add(nums[i]);
            }
            for (Integer u : un) {
                arr[u]++;
            }
            start++;
        }
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) max = Math.max(max, i);
        }
        return max;
    }
}