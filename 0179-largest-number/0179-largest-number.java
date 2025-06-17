class Solution {
    public String largestNumber(int[] nums) {
         String[] sNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            sNums[i] = String.valueOf(nums[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        List<String> sorted = new ArrayList<>();
        Collections.addAll(sorted, sNums);

        sorted.sort(new addComparator());
        if (sorted.get(0).equals("0")) {
            return "0";
        }
        for(String a : sorted) {
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    static class addComparator implements Comparator<String> {
        @Override
        public int compare(String p1, String p2) {
            return (p2 + p1).compareTo(p1 + p2);
        }
    }
}