class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unique = new HashSet<>();
        for (int c : candyType) {
            unique.add(c);
        }

        return unique.isEmpty() ? 0 : Math.min(unique.size(), candyType.length / 2);
    }
}