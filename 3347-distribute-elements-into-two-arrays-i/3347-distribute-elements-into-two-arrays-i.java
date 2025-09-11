class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        System.out.println(l1);
        System.out.println(l2);
        for (int i = 2; i < nums.length; i++) {
            System.out.println("you are");
            if (l1.get(l1.size() - 1) > l2.get(l2.size() - 1)) {
                l1.add(nums[i]);
                System.out.println(l1);
            } else {
                l2.add(nums[i]);
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < l1.size(); i++) {
            res[i] = l1.get(i);
        }

        for (int i = 0, j = l1.size(); i < l2.size() && j < res.length; i++, j++) {
            res[j] = l2.get(i);
        }
        return res;
    }
}