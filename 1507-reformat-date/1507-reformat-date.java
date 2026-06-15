class Solution {
    public String reformatDate(String date) {
        StringBuilder str = new StringBuilder();
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] arr = date.trim().split("\\s+");
        str.append(arr[2]);
        str.append("-");
        for (int i = 0; i < month.length; i++) {
            if (month[i].equals(arr[1])) {
                if (i + 1 > 9) str.append(i + 1);
                else str.append(0).append(i + 1);
                str.append("-");
                break;
            }
        }
        StringBuilder da = new StringBuilder();
        for (int i = 0; i < arr[0].length(); i++) {
            if (Character.isDigit(arr[0].charAt(i))) da.append(arr[0].charAt(i));
        }
        int d = Integer.parseInt(da.toString());
        if (d > 9) str.append(d);
        else str.append(0).append(d);
        return str.toString();
    }
}