class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = requests[0];
        if (requests.length > 1) {
            for (int i = 1; i < requests.length; i++) {
                ans += Math.abs(requests[i] - requests[i - 1]);
            }
        } 
        return ans;
    }
}