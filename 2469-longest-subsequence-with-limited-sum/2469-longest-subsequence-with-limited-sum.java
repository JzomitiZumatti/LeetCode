class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        int j = 0;
        for (int query : queries) {
            int sum = 0;
            int counter = 0;
            for (int num : nums) {
                if (sum + num <= query) {
                    sum += num;
                    counter++;
                } else break;
            }
            res[j] = counter;
            j++;
        }
        return res;
    }
}