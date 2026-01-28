class Solution {
    public boolean isFascinating(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Integer> unique = new HashSet<>();
        int i = 1;
        while (i <= 3) {
            stringBuilder.append(n * i);
            i++;
        }
        for (int j = 0; j < stringBuilder.length(); j++) {
            int number = stringBuilder.charAt(j) - '0';
            if (number == 0) return false;
            if (!unique.contains(number)) unique.add(number);
            else return false;
        }
        return unique.size() == 9;
    }
}