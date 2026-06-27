class Solution {
    public String triangleType(int[] nums) {
        HashSet<Integer> un = new HashSet<>();
        for (int num : nums) {
            un.add(num);
        }
        if (un.size() != 1) {
            int a = nums[0] + nums[1];
            int b = nums[0] + nums[2];
            int c = nums[1] + nums[2];
            if (a <= nums[2] || b <= nums[1] || c <= nums[0]) return "none";
        }
        return un.size() == 1 ? "equilateral" : un.size() == 2 ? "isosceles" : "scalene";
    }
}