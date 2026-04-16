class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, List<Integer>> numberPos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numberPos.putIfAbsent(num, new ArrayList<>());
            numberPos.get(num).add(i);
        }
        for (int query : queries) {
            int num = nums[query];
            if (!numberPos.containsKey(num) || numberPos.get(num).size() == 1) ans.add(-1);
            else {
                int pos = binarySearch(numberPos.get(num), query);
                int prev = numberPos.get(num).get((pos - 1 + numberPos.get(num).size()) % numberPos.get(num).size());
                int next = numberPos.get(num).get((pos + 1) % numberPos.get(num).size());
                int d1 = Math.min(Math.abs(query - prev), nums.length - Math.abs(query - prev));
                int d2 = Math.min(Math.abs(query - next), nums.length - Math.abs(query - next));
                ans.add(Math.min(d1, d2));
            }
        }
        return ans;
    }

    private static int binarySearch(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}