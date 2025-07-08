class Solution {
    public int lastStoneWeight(int[] stones) {
        Stack<Integer> ston = new Stack<>();
        Arrays.sort(stones);
        for (int s : stones) {
            ston.push(s);
        }
        //System.out.println(ston);
        while (ston.size() > 1) {
            int dif = ston.pop() - ston.pop();
            //System.out.println(dif);
            if (dif != 0) {
                ston.push(dif);
            }
            Collections.sort(ston);
            //System.out.println(ston);
        }
        return !ston.isEmpty() ? ston.peek() : 0;
    }
}