class Solution {
    public int maxProduct(int n) {
        return listOfNUmbers(n).get(listOfNUmbers(n).size() - 1) * listOfNUmbers(n).get(listOfNUmbers(n).size() - 2);
    }
    
    private static List<Integer> listOfNUmbers(int n) {
        List<Integer> numbers = new ArrayList<>();
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            numbers.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
        Collections.sort(numbers);
        return numbers;
    }
}