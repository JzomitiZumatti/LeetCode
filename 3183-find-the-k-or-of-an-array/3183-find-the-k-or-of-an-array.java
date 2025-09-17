class Solution {
    public int findKOr(int[] nums, int k) {
        if (k == 1) {
            int a = 0;
            for (int n : nums) {
                a |= n;
            }
            return a;
        }
        List<List<Integer>> r = new ArrayList<>();
        int maxSize = 0;
        for (int n : nums) {
            List<Integer> bits = bitForm(n);
            r.add(bits);
            maxSize = Math.max(maxSize, bits.size());
        }

        StringBuilder str = new StringBuilder();
        for (int l = 0; l < maxSize; l++) {
            int sum = 0;
            for (List<Integer> integers : r) {
                if (l < integers.size()) {
                    sum += integers.get(l);
                }
            }
            str.append(sum >= k ? 1 : 0);
        }
        return Integer.parseInt(str.reverse().toString(), 2);
    }

    private static List<Integer> bitForm(int num) {
        List<Integer> res  = new ArrayList<>();
        String binary = Integer.toBinaryString(num);
        for (int i = binary.length() - 1; i >= 0; i--) {
            res.add(binary.charAt(i) - '0');
        }
        return res;
    }
}