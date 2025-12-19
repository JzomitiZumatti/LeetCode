class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int[] arr = new int[list1.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            String s1 = list1[i];
            for (int j = 0; j < list2.length; j++) {
                String s2 = list2[j];
                if (s1.equals(s2)) {
                    int sum = i + j + 2;
                    arr[i] = sum;
                    min = Math.min(min, sum);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i : arr) {
            if (i == min) counter++;
        }
        String[] res = new String[counter];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == min) {
                res[i] = list1[j];
                i++;
            }
        }
        return res;
    }
}