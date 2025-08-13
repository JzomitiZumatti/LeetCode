class Solution {
    public int[] transformArray(int[] nums) {
        LinkedList<Integer> sd = new LinkedList<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                sd.addFirst(0);
            } else {
                sd.addLast(1);
            }
        }
        int[] res = new int[nums.length];
        int counter = 0;
        for (Integer s : sd) {
            res[counter] = s;
            counter++;
        }
        return  res;
    }
}