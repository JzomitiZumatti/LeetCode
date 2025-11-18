class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bits.length;) {
            if (bits[i] == 1) {
                stringBuilder.append(bits[i]);
                stringBuilder.append(bits[i + 1]);
                i = i + 2;
            } else {
                stringBuilder.append(bits[i]);
                i++;
            }
            res.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        return res.getLast().length() == 1;
    }
}