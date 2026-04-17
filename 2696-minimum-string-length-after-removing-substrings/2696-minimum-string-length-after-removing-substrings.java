class Solution {
    public int minLength(String s) {
        Stack<Character> ans = new Stack<>();
        ans.add(s.charAt(0));
        if (s.length() == 1) return 1;
        char[] arr = s.toCharArray();
        Set<String> task = new HashSet<>(List.of("AB", "CD"));
        StringBuilder curr = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            char b = arr[i];
            if (!ans.isEmpty()) {
                char a = ans.peek();
                curr.setLength(0);
                curr.append(a).append(b);
                if (task.contains(curr.toString())) {
                    ans.pop();
                } else ans.add(b);
            } else ans.add(b);
        }
        return ans.size();
    }
}