class Solution {
    public String largestNumber(int[] nums) {
        String[] sNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sNums[i] = String.valueOf(nums[i]);
        }

        List<String> sorted = new ArrayList<>();
        Collections.addAll(sorted, sNums);

        sorted.sort((p1, p2) -> (p2 + p1).compareTo(p1 + p2));

        if (sorted.get(0).equals("0")) {
           return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String num : sorted) {
            stringBuilder.append(num);
        }

        return stringBuilder.toString();
    }
}