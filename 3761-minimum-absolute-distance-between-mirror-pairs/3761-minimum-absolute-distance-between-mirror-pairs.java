class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> numPoses = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            numPoses.putIfAbsent(n, new ArrayList<>());
            numPoses.get(n).add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int rev = reverse(n);
            if (numPoses.containsKey(rev)) {
                int index = binarySearch(numPoses.get(rev), i);
                    if (index != - 1) {
                        ans = Math.min(ans, Math.abs(i - numPoses.get(rev).get(index)));
                    }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}