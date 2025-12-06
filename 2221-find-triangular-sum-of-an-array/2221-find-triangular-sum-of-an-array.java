class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> list = new ArrayList<>(Arrays.stream(nums)
                .boxed()
                .toList());
        while (list.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                temp.add((list.get(i - 1) + list.get(i)) % 10);
            }
            list.clear();
            list.addAll(temp);
        }
        return list.getFirst();
    }
}