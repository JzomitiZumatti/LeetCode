class Solution {
    public boolean checkOnesSegment(String s) {
        String[] arr = s.split("0+");
        return arr.length == 1;
    }
}