class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < nums.length) {
            stringBuilder.append(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    stringBuilder.append(nums[j]);
                    if (stringBuilder.toString().equals(target)) ans++;
                    stringBuilder.delete(nums[i].length(), stringBuilder.length());
                }
            }
            stringBuilder.setLength(0);
            i++;
        }
        return ans;
    }
}