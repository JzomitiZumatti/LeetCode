class Solution {
    public int maxDigitRange(int[] nums) {
        List<Integer> numRanges = new ArrayList<>();
        int max = 0;
        for (int num : nums) {
            int temp = num;
            int largest = 0;
            int smallest = 9;
            while (temp / 10 != 0) {
                int digit = temp % 10;
                largest = Math.max(largest, digit);
                smallest = Math.min(smallest, digit);
                temp /= 10;
            }
            largest = Math.max(largest, temp);
            smallest = Math.min(smallest, temp);
            int diff = largest - smallest;
            numRanges.add(diff);
            max = Math.max(max, diff);
        }
        int ans = 0;
        for (int i = 0; i < numRanges.size(); i++) {
            if (numRanges.get(i) == max) ans += nums[i];
        }
        return ans;
    }
}