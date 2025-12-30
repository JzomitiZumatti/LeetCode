class Solution {
    public int secondHighest(String s) {
        PriorityQueue<Integer> re = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) re.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        if (re.isEmpty()) return -1;
        List<Integer> nums = new ArrayList<>();
        while (!re.isEmpty()) {
            nums.add(re.poll());
        }
        for (int i = nums.size() - 1; i >= 1; i--) {
            if (nums.get(i - 1) < nums.get(i)) return nums.get(i - 1);
        }
        return -1;
    }
}