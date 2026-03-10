class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] isSingle = new boolean[nums.length];
        Arrays.fill(isSingle, true);
        for (int i = 0; i < nums.length - 1; i++) {
            if (isSingle[i]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (isSingle[j]) {
                        if ((nums[i] ^ nums[j]) == 0) {
                            isSingle[i] = false;
                            isSingle[j] = false;
                            break;
                        }
                    }
                }
            }
            if (isSingle[i]) res.add(nums[i]);
        }
        if (isSingle[nums.length - 1]) res.add(nums[nums.length - 1]);
        return res.stream().mapToInt(i -> i).toArray();
    }
}