class Solution {
    public int secondHighest(String s) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) nums.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        if (nums.isEmpty()) return -1;
        nums.sort(Integer::compareTo);
        for (int i = nums.size() - 1; i >= 1; i--) {
            if (nums.get(i - 1) < nums.get(i)) return nums.get(i - 1);
        }
        return -1;
    }
}