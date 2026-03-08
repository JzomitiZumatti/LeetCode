class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> unique = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        sd(nums, unique, path);
        boolean[] isPresent = new boolean[unique.size()];
        for (String num : nums) {
            for (int i = 0; i < unique.size(); i++) {
                if (num.equals(unique.get(i))) isPresent[i] = true;
            }
        }
        for (int i = 0; i < isPresent.length; i++) {
            if (!isPresent[i]) return unique.get(i);
        }
        return "";
    }

    private static void sd(String[] nums, List<String> unique, StringBuilder path) {
        if (path.length() == nums[0].length()) {
            unique.add(path.toString());
            return;
        }

        path.append(1);
        sd(nums, unique, path);
        path.deleteCharAt(path.length() - 1);

        path.append(0);
        sd(nums, unique, path);
        path.deleteCharAt(path.length() - 1);
    }
}