class Solution {
    public int sortPermutation(int[] nums) {
        int ans = 0;
        List<Integer> notOnPlace = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) notOnPlace.add(nums[i]);
        }
        if (notOnPlace.size() > 0) ans = notOnPlace.getFirst();
        for (int i = 1; i < notOnPlace.size(); i++) {
            ans &= notOnPlace.get(i);
        }
        return ans;
    }
}