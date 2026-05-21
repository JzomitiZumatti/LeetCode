class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int ans = 0;
        Set<Integer> forCheck = getAllPrefix(arr1);
        for (int a : arr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            if (forCheck.contains(a)) ans = Math.max(ans, stringBuilder.length());
            else {
                while (stringBuilder.length() > 1) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    if (forCheck.contains(Integer.parseInt(stringBuilder.toString())))
                        ans = Math.max(ans, stringBuilder.length());
                }
            }
        }
        return ans;
    }

    private static Set<Integer> getAllPrefix(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        for (int a : arr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            ans.add(a);
            while (stringBuilder.length() > 1) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                ans.add(Integer.parseInt(stringBuilder.toString()));
            }
        }
        return ans;
    }
}