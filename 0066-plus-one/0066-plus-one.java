import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> numbers = new ArrayList<>(Arrays.stream(digits).boxed().toList());
        Integer lastEl = numbers.getLast();
        StringBuilder str = new StringBuilder();
        if (lastEl != 9 ) {
            numbers.set(numbers.size() - 1, numbers.getLast() + 1);
        } else {
            List<Integer> numbersCopy = List.copyOf(numbers);
            System.out.println(String.valueOf(numbersCopy));
            for (int i = numbersCopy.size() - 1; i >=  0; i--) {
                if (numbersCopy.get(i) == 9) {
                    str.append(numbersCopy.get(i));
                    numbers.removeLast();
                } else {
                    str.append(numbersCopy.get(i));
                    numbers.removeLast();
                    break;
                }
            }
            str.reverse();
            BigInteger bigInt = new BigInteger(String.valueOf(str)).add(new BigInteger("1"));
            String ho = String.valueOf(bigInt);
            for (int i = 0; i < ho.length(); i++) {
                numbers.addLast(Integer.parseInt(String.valueOf(ho.charAt(i))));
            }
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}