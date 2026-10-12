class Solution {
    public boolean threeFibonacciSum(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        fibonacci.add(1);
        int sum = 2;
        if (sum == n) return true;
        while (sum < n) {
            sum =- fibonacci.get(fibonacci.size() - 3);
            fibonacci.add(fibonacci.getLast() + fibonacci.get(fibonacci.size() - 2));
            sum += fibonacci.getLast();
            if (sum == n) return true;
        }
        return false;
    }
}