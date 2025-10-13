class Solution {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                stringBuilder.append(arr[i]);
                stringBuilder.append("[.]");
            } else {
                stringBuilder.append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }
}