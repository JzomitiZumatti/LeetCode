class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.substring(0, gcd(str1.length(), str2.length())).equals(str2.substring(0, gcd(str1.length(), str2.length())))) return "";
        String[] arr1 = str1.split(str1.substring(0, gcd(str1.length(), str2.length())));
        String[] arr2 = str2.split(str2.substring(0, gcd(str1.length(), str2.length())));
        for (int i = 1; i < arr1.length; i++) {
            if (!arr1[i - 1].equals(arr1[i])) return "";
        }
        for (int i = 1; i < arr2.length; i++) {
            if (!arr2[i - 1].equals(arr2[i])) return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    
    private static int gcd(int a, int b) {
        int minLength = Math.min(a, b);
        for (int i = minLength; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) return i;
        }
        return -1;
    }
}