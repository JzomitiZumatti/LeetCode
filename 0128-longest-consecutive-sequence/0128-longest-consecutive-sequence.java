class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> treeNums = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));
        List<Integer> result = new ArrayList<>();
        List<Integer> listFromTreeNums = new ArrayList<>(treeNums);
        if (treeNums.size() == 1) {
            return 1;
        }

        for (int i = 0; i < listFromTreeNums.size(); ) {
            int j = i + 1;
            while (j < listFromTreeNums.size() && listFromTreeNums.get(j) - listFromTreeNums.get(j - 1) == 1) {
                j++;
            }
            if (j - i > result.size()) {
                result = new ArrayList<>(listFromTreeNums.subList(i, j));
            }
            i = j;
        }
       return result.size();
    }
}