class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        if (numRows == 0) {
            dp.add(List.of(1));
            return dp;
        }
        dp.add(List.of(1));
        while (dp.size() < numRows) {
            List<Integer> list = new ArrayList<>();
            list.add(dp.getLast().getFirst());
            for (int i = 1; i < dp.getLast().size(); i++) {
                list.add(dp.getLast().get(i) + dp.getLast().get(i - 1));
            }
            list.add(dp.getLast().getLast());
            dp.add(list);
        }
        return dp;
    }
}