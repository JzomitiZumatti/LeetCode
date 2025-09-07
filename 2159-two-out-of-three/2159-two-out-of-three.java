class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();
        Set<Integer> num3 = new HashSet<>();

        for (int n : nums1) {
            num1.add(n);
        }
        for (int n : nums2) {
            num2.add(n);
        }
        for (int n : nums3) {
            num3.add(n);
        }

        Set<Integer> all = new HashSet<>();

        all.addAll(num1);
        all.addAll(num2);
        all.addAll(num3);

        for (Integer s : all) {
            int counter = 0;
            if (num1.contains(s)) counter++;
            if (num2.contains(s)) counter++;
            if (num3.contains(s)) counter++;
            if (counter >= 2) res.add(s);
        }
        return res;
    }
}