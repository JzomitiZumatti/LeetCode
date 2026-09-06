class Solution {
    public int passwordStrength(String password) {
        Set<Character> used = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!used.contains(c)) {
                if (Character.isAlphabetic(c) && Character.isLowerCase(c)) ans += 1;
                else if (Character.isAlphabetic(c) && Character.isUpperCase(c)) ans += 2;
                else if (Character.isDigit(c)) ans += 3;
                else ans += 5;
            }
            used.add(c);
        }
        return ans;
    }
}