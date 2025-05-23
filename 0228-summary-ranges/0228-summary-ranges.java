class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        String avRes = "";
        boolean ra = true;
        for (int i = 0; i < nums.length; i++) {
            int next = i + 1 < nums.length ? i + 1 : i;
            if (nums[i] + 1 == nums[next]) {
                if (ra) {
                    avRes = String.valueOf(nums[i]) + "->";
                    ra = false;
                }
            } else {
                    ra = true;
                    avRes += nums[i];
                    ranges.add(avRes);
                    avRes = "";
            }
        }
        return ranges;
    }
}