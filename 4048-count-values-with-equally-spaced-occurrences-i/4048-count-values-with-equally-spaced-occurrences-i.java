class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans = 0;
        Map<Integer, List<Integer>> numPoses = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numPoses.putIfAbsent(num, new ArrayList<>());
            numPoses.get(num).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : numPoses.entrySet()) {
            if (entry.getValue().size() == 3) {
                int a = entry.getValue().getFirst();
                int b = entry.getValue().get(1);
                int c = entry.getValue().getLast();
                if (b - a == c - b) ans++;
            }
        }
        return ans;
    }
}