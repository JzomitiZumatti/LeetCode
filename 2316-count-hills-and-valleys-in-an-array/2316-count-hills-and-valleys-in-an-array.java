class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> fd = new ArrayList<>();
        fd.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                fd.add(nums[i]);
            }
        }
        int[] un = fd.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(fd);
        int counter = 0;
        int i = 1;
        while (i < un.length - 1) {
            int current = i;
            int prev = i - 1;
            int next = i + 1;
            if (un[prev] < un[current] && un[next] < un[current]) {
                counter++;
            }
            if (un[prev] > un[current] && un[next] > un[current]) {
                counter++;
            }
            i++;
        }
        return counter;
    }
}