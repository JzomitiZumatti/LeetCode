class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) stringBuilder.append(Integer.toBinaryString(Integer.parseInt(arr[i])));
            else {
                stringBuilder.append(Integer.toBinaryString(Integer.parseInt(arr[i])));
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }
}