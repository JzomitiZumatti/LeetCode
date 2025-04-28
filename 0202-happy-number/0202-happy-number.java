class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (n != 1) {
            String numb = String.valueOf(n);
            int[] arr = new int[numb.length()];
            for (int i = 0; i < numb.length(); i++) {
                arr[i] = Integer.parseInt(String.valueOf(numb.charAt(i)));
            }
            System.out.println("Arr length = " + arr.length);
            System.out.println("Array values: ");
            for (int ar : arr) {
                System.out.print(ar + " ");
            }
            n = 0;
            if (arr.length == 1 && (arr[0] == 0 || arr[0] == 2 || arr[0] == 3)) {
                System.out.println("You are in first condition");
                n = arr[0];
                break;
            } else {
                System.out.println("You are in second condition");
                for(int arrEL : arr) {
                    n += arrEL * arrEL;
                }
                if (numbers.contains(n)) {
                    break;
                } else {
                    numbers.add(n);
                }
            }
        }
        System.out.println("n = " + n);
        return n == 1 ? true : false;
    }
}