class Solution {
    public int maximum69Number (int num) {
        String numS = String.valueOf(num);
        StringBuilder sb = new StringBuilder(numS);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}