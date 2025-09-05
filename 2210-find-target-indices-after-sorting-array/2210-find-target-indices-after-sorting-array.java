class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> s = new PriorityQueue<>();

        for (int n : nums) {
            s.add(n);
        }

        int i = 0;
        while (!s.isEmpty()) {
            int temp = s.poll();
            if (temp == target) {
                res.add(i);
            }
            if (temp > target) break;
            i++;
        }

        return res;
    }
}