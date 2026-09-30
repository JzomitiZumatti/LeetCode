class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        List<Integer> adsdas = new ArrayList<>();
        Stack<Character> fds = new Stack<>();
        Stack<Integer> saf = new Stack<>();
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            fds.add(c);
            if (c == '(') {
                int n = saf.isEmpty() ? 0 : saf.peek() + 1;
                saf.add(n);
                adsdas.add(n);
            } else {
                fds.pop();
                int n = saf.pop();
                adsdas.add(n);
            }
        }
        int[] ans = new int[adsdas.size()];
        for (int i = 0; i < adsdas.size(); i++) {
            ans[i] = adsdas.get(i) % 2;
        }
        return ans;
    }
}