class Solution {
    public int minMaxGame(int[] nums) {
        int state = 1;
        List<Integer> ns = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int n : nums) {
            ns.add(n);
        }
        if (ns.size() < 2) {
            return ns.get(0);
        }

        do {
            for (int i = 0; i < ns.size() - 1; i = i + 2) {
                int next = i + 1;
                if (state % 2 != 0) {
                    temp.add(Math.min(ns.get(i), ns.get(next)));
                } else {
                    temp.add(Math.max(ns.get(i), ns.get(next)));
                }
                state++;
            }
            ns.clear();
            ns.addAll(temp);
            temp.clear();
        } while (ns.size() >= 2);
        return ns.get(0);
    }
}