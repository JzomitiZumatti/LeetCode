class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(List.of(1));
        dp.add(List.of(1, 1));
        while (dp.size() <= rowIndex) {
            List<Integer> list = new ArrayList<>();
            list.add(dp.getLast().getFirst());
            for (int i = 1; i < dp.getLast().size(); i++) {
                list.add(dp.getLast().get(i) + dp.getLast().get(i - 1));
            }
            list.add(dp.getLast().getLast());
            dp.add(list);
        }
        return dp.get(rowIndex);
    }
}