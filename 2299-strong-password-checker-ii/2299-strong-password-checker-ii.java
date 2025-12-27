class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        String special = "!@#$%^&*()-+";
        Set<Character> spec = new HashSet<>();
        for (int i = 0; i < special.length(); i++) {
            spec.add(special.charAt(i));
        }
        boolean isUpper = false;
        boolean isLower = false;
        boolean isNumber = false;
        boolean isSpecial = false;
        for (int i = 1; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i - 1))) isLower = true;
            if (Character.isUpperCase(password.charAt(i - 1))) isUpper = true;
            if (Character.isDigit(password.charAt(i - 1))) isNumber = true;
            if (spec.contains(password.charAt(i - 1))) isSpecial = true;
            if (password.charAt(i) == password.charAt(i - 1)) return false;
        }
        if (Character.isLowerCase(password.charAt(password.length() - 1))) isLower = true;
        if (Character.isUpperCase(password.charAt(password.length() - 1))) isUpper = true;
        if (Character.isDigit(password.charAt(password.length() - 1))) isNumber = true;
        if (spec.contains(password.charAt(password.length() - 1))) isSpecial = true;
        return isUpper && isLower && isNumber && isSpecial;
    }
}