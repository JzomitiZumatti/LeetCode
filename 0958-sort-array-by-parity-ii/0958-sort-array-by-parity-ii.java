class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int[] sorted = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        int j = 0;
        int k = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (i % 2 == 0) {
                sorted[i] = even.get(j);
                j++;
            } else {
                sorted[i] = odd.get(k);
                k++;
            }
        }
        return sorted;
    }
}