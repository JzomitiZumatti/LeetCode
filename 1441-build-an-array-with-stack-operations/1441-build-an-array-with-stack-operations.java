class Solution {
    public List<String> buildArray(int[] target, int n) {
        Set<Integer> need = new HashSet<>();
        for (int num : target) {
            need.add(num);
        }
        List<String> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            if (need.contains(i)) {
                stack.push(i);
                ans.add("Push");
            } else {
                stack.push(i);
                ans.add("Push");
                stack.pop();
                ans.add("Pop");
            }
            if (stack.size() == target.length) break;
        }
        return ans;
    }
}