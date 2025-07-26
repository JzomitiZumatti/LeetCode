class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unique = new HashSet<>();
        for (int c : candyType) {
            unique.add(c);
        }

        int counter = 0;
        for (Integer u : unique) {
            if (counter < candyType.length / 2) {
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
    }
}