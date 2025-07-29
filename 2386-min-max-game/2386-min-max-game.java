class Solution {
    public int minMaxGame(int[] nums) {
        Queue<Integer> ns = new LinkedList<>();
        for (int n : nums) {
            ns.add(n);
        }
        if (ns.size() == 1) {
            return ns.poll();
        }
        int flag = 0;
        do {
            int first = ns.poll();
            int second = ns.poll();
            if (flag == 0) {
                ns.add(Math.min(first, second));
                flag = 1;
            } else {
                ns.add(Math.max(first, second));
                flag = 0;
            }
        } while (ns.size() >= 2);
        return ns.poll();
    }
}