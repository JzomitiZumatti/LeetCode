class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> unique = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        sd(nums, unique, path);
        Set<String> u = new HashSet<>();
        Collections.addAll(u, nums);
        for (String s : unique) {
            if (!u.contains(s)) return s;
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