class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        int j = 0;
        for (int query : queries) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == query) {
                    ans[j] = i;
                    list.remove(i);
                    list.addFirst(query);
                    j++;
                    break;
                }
            }
        }
        return ans;
    }
}