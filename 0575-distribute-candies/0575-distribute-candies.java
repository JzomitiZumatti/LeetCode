class Solution {
    public int distributeCandies(int[] candyType) {
        boolean[] seen = new boolean[200001];
        int unique = 0;
        for (int c : candyType) {
            if (!seen[c + 100000]) {
                seen[c + 100000] = true;
                unique++;
            }
        }
        return Math.min(unique, candyType.length / 2);

    }
}