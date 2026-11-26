class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int candidate1 = 0;
        int candidate2 = 0;
        int counter1 = 0;
        int counter2 = 0;
        for (int num : nums) {
            if (num == candidate1) counter1++;
            else if (num == candidate2) counter2++;
            else if (counter1 == 0) {
                candidate1 = num;
                counter1++;
            } else if (counter2 == 0) {
                candidate2 = num;
                counter2++;
            } else {
                counter1--;
                counter2--;
            }
        }
        counter1 = 0;
        counter2 = 0;
        for (int num : nums) {
            if (num == candidate1) counter1++;
            else if (num == candidate2) counter2++;
        }
        if (counter1 > nums.length / 3) ans.add(candidate1);
        if (counter2 > nums.length / 3) ans.add(candidate2);
        return ans;
    }
}