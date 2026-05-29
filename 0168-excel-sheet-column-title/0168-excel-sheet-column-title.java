class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char temp = (char) ((columnNumber) % 26 + 'A');
            stringBuilder.append(temp);
            columnNumber /= 26;
        }
        return stringBuilder.reverse().toString();
    }
}