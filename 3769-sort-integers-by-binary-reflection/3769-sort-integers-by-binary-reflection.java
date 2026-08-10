class Solution {
    public int[] sortByReflection(int[] nums) {
        Map<Integer, List<Integer>> originalReverse = new HashMap<>();
        int[] ans = new int[nums.length];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            stringBuilder.append(Integer.toBinaryString(n)).reverse();
            int reverse = Integer.parseInt(stringBuilder.toString(), 2);
            originalReverse.putIfAbsent(reverse, new ArrayList<>());
            originalReverse.get(reverse).add(n);
            stringBuilder.setLength(0);
        }
        Map<Integer, List<Integer>> sortedMap = new TreeMap<>(originalReverse);
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : sortedMap.entrySet()) {
            Collections.sort(entry.getValue());
            for (int j = 0; j < entry.getValue().size(); j++) {
                ans[i] = entry.getValue().get(j);
                i++;
            }
        }
        return ans;
    }
}