class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        boolean result1 = true;
        boolean result2 = true;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            char c1 = arr1[i];
            char c2 = arr2[i];
            if (c1 < c2 && result1) {
                result1 = false;
            }
            if (c2 < c1 && result2) {
                result2 = false;
            }
        }
        return result1 || result2;
    }
}