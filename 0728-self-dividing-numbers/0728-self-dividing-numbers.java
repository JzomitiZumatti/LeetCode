class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivided(i)) list.add(i);
        }
        return list;
    }

    private static boolean isSelfDivided(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        if (stringBuilder.length() == 1) return true;
        for (int i = 0; i < stringBuilder.length(); i++) {
            int current = Integer.parseInt(String.valueOf(stringBuilder.toString().charAt(i)));
            if (current == 0) return false;
            if (num % current != 0) return false;
        }
        return true;
    }
}