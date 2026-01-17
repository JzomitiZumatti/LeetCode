class Solution {
    public int countKeyChanges(String s) {
        int counter = 0;
        for (int i = 1; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i - 1)).toLowerCase();
            String b = String.valueOf(s.charAt(i)).toLowerCase();
            if (!a.equals(b)) counter++;
        }
        return counter;
    }
}