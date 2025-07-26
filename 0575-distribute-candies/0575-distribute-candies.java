class Solution {
    public int distributeCandies(int[] candyType) {
        int counter = candyType.length > 0 ? 1 : 0;
        Arrays.sort(candyType);
        for (int i = 1; i < candyType.length; i++) {
            if (candyType[i] != candyType[i - 1] && counter < candyType.length / 2) {
                counter++;
            }
            if (counter == candyType.length / 2) {
                return counter;
            }
        }
        return counter;
    }
}