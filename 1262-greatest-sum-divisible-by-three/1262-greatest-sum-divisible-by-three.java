class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 3 == 0) return sum;

        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        for (int num : nums) {
            if (num % 3 == 1)  mod1.add(num);
            else if (num % 3 == 2) mod2.add(num);
        }

        mod1.sort(Integer::compareTo);
        mod2.sort(Integer::compareTo);

        int mod = sum % 3;
        int result = 0;

        if (mod == 1) {
            if (!mod1.isEmpty()) result = Math.max(result, sum - mod1.getFirst());
            if (mod2.size() >= 2) result = Math.max(result, sum - mod2.getFirst() - mod2.get(1));
        } else {
            if (!mod2.isEmpty()) result = Math.max(result, sum - mod2.getFirst());
            if (mod1.size() >= 2) result = Math.max(result, sum - mod1.getFirst() - mod1.get(1));
        }

        return result;
    }
}