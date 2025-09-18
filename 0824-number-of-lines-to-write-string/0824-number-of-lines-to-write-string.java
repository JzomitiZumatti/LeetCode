class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = alphabetString.toCharArray();
        Map<Character, Integer> letterPixel = new HashMap<>();
        for (int i = 0; i < alphabetArray.length; i++) {
            letterPixel.put(alphabetArray[i], letterPixel.getOrDefault(alphabetArray[i], widths[i]));
        }
        int counter = 1;
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            int pixel = letterPixel.get(s.charAt(i));
            if (size + pixel <= 100) {
                size += pixel;
            } else {
                counter++;
                size = pixel;
            }
        }
        return new int[]{counter, size};
    }
}