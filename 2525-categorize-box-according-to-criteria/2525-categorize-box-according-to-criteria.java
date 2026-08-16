class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long) length * width * height;
        boolean isBulky = length >= 10_000 || width >= 10_000 || height >= 10_000 || vol >= 1_000_000_000;
        boolean isHeavy = mass >= 100;
        if (isHeavy && isBulky) return "Both";
        if (!isBulky && !isHeavy) return "Neither";
        if (isBulky && !isHeavy) return "Bulky";
        else return "Heavy";
    }
}