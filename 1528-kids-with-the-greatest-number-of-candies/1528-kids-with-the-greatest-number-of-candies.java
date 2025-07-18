class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> is = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int counter = 0;
            for (int j = 0; j < candies.length; j++) {
                if (i != j) {
                    int res = candies[i] + extraCandies;
                    if (res >= candies[j]) {
                        counter++;
                    } else {
                        break;
                    }
                }
            }
            if (counter == candies.length - 1) {
                is.add(true);
            } else {
                is.add(false);
            }
        }
        return is;
    }
}