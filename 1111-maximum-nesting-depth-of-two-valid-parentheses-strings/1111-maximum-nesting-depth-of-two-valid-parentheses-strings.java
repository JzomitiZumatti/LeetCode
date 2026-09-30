class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        List<Integer> listofDepth = new ArrayList<>();
        Stack<Integer> depth = new Stack<>();
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            int n;
            if (c == '(') {
                n = depth.isEmpty() ? 0 : depth.peek() + 1;
                depth.add(n);
            } else {
                n = depth.pop();
            }
            listofDepth.add(n % 2);
        }
        return listofDepth.stream().mapToInt(Integer::intValue).toArray();
    }
}