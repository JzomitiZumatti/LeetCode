class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num).reverse();
        int newNumber = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);
        return num == Integer.parseInt(stringBuilder.append(newNumber).reverse().toString());
    }
}