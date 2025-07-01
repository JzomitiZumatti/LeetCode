class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int[] freq = new int[nums.length];
        int j = 0;
        int current = 0;
        int next = current + 1;
        int max = 0;
        while (next < nums.length) {
            if (nums[current] == nums[next]) {
                freq[j] += 1;
            } else {
                freq[j] += 1;
                j++;
            }
            max = max < freq[j] ? current : max;
            current++;
            next++;
        }
        return nums[max];
    }
}