class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> letterPos = new HashMap<>();
        int pos = 1;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            letterPos.put(ch, pos);
            pos++;
        }
        int res = 0;
        int length = columnTitle.length() - 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            res += (int) (letterPos.get(columnTitle.charAt(i)) * Math.pow(26, length));
            length--;
        }
        return res;
    }
}