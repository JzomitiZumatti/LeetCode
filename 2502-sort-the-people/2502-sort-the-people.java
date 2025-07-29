class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] sorted = new String[names.length];
        Map<Integer, String> nameHeight = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            nameHeight.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int j = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            sorted[j] = nameHeight.get(heights[i]);
            j++;
        }
        return sorted;
    }
}