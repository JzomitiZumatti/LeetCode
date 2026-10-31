class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> mono = new Stack<>();
        int i = 0;
        while (i < temperatures.length) {
            if (mono.isEmpty()) mono.add(i);
            else {
                int temp = temperatures[i];
                int t = temperatures[mono.peek()];
                if (temp > t) {
                    while (!mono.isEmpty() && temp > temperatures[mono.peek()]) {
                        ans[mono.peek()] = i - mono.peek();
                        mono.pop();
                    }
                }
            }
            mono.add(i);
            i++;
        }
        return ans;
    }
}