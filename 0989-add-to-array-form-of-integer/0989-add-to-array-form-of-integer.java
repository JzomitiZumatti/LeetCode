class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;
        
        while (i >= 0 || k > 0 || carry > 0) {
            int digitNum = (i >= 0) ? num[i] : 0;
            int digitK = (k > 0) ? k % 10 : 0;
            
            int sum = digitNum + digitK + carry;
            
            ans.add(sum % 10);
            carry = sum / 10;
            
            i--;
            k /= 10;
        }
        
        Collections.reverse(ans);
        return ans;
    }
}