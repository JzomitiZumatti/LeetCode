class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int n = 0;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies - (1 + n) >= 0) {
                    arr[i] += 1 + n;
                    candies -= 1 + n;
                } else {
                    arr[i] += candies;
                    candies -= candies;
                }
                n++;
            }
        }
        return arr;
    }
}