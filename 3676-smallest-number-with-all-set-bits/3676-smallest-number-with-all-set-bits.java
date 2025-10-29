class Solution {
    public int smallestNumber(int n) {
        for (int i = n; i <= Integer.MAX_VALUE; i++) {
            String s = Integer.toBinaryString(i);
            Set<Integer> unique = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                unique.add(Integer.parseInt(String.valueOf(s.charAt(j))));
            }
            if (unique.contains(1) && unique.size() == 1) return i;
        }
        return 0;
    }
}