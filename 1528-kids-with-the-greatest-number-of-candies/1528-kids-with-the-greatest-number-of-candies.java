class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> is = new ArrayList<>();
        int[] copy = Arrays.copyOf(candies, candies.length);
        Arrays.sort(copy);
        int max = copy[copy.length - 1];
        for (int c : candies) {
            is.add(c + extraCandies >= max);
        }
        return is;
    }
}