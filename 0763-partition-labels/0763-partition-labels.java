class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int last = left;
        int start = 0;
        while (left < s.length()) {
            char c = s.charAt(left);
            for (int i = s.length() - 1; i > left; i--) {
                if (s.charAt(i) == c) {
                    last = Math.max(last, i);
                    break;
                }
            }
            if (left == last) {
                res.add(last - start + 1);
                start = left + 1;
                last = left + 1;
            }
            left++;
        }
        return res;
    }
}