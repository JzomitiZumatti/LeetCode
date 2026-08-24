class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < drones.length; i++) {
            int x = Math.abs(target[0] - drones[i][0]);
            int y = Math.abs(target[1] - drones[i][1]);
            int sum = x + y;
            System.out.println(sum);
            if (sum <= drones[i][2]) {
                if (sum < min) {
                    min = sum;
                    ans = i;
                }
            }
        }
        return ans;
    }
}