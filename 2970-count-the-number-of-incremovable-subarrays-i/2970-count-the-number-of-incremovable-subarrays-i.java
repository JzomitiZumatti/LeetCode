class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            Set<Integer> indices = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                indices.add(j);
                if (isIncremovable(listGenerator(nums, indices))) ans++;
            }
            i++;
        }
        return ans;
    }

    private static List<Integer> listGenerator(int[] arr, Set<Integer> indices) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!indices.contains(i)) list.add(arr[i]);
        }
        return list;
    }

    private static boolean isIncremovable(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) return false;
        }
        return true;
    }
}