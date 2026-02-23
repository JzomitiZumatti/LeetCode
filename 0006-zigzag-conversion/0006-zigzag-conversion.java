class Solution {
    public String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) return s;
        List<List<Character>> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new ArrayList<>());
        }
        int currentRow = 0;
        boolean up = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rows.get(currentRow).add(c);
            if (up) currentRow++;
            else currentRow--;
            up = currentRow == 0 || currentRow != numRows - 1 && up;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (List<Character> row : rows) {
            for (Character c : row) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}