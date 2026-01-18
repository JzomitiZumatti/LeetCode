class Solution {
    public boolean squareIsWhite(String coordinates) {
        Map<String, Boolean> coordinateColor = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean b;
        for (int i = 0; i < 8; i++) {
            b = i % 2 != 0;
            for (char c = 'a'; c <= 'h'; c++) {
                stringBuilder.append(c).append(i + 1);
                coordinateColor.put(stringBuilder.toString(), b);
                stringBuilder.setLength(0);
                b = !b;
            }
        }
        return coordinateColor.get(coordinates);
    }
}