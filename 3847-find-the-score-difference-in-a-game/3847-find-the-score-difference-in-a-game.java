class Solution {
    public int scoreDifference(int[] nums) {
        int[] playerScore = {0, 0};
        boolean[] playerStatus = {true, false};
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num % 2 != 0) {
                playerStatus[0] = !playerStatus[0];
                playerStatus[1] = !playerStatus[1];
            }
            if ((i + 1) % 6 == 0) {
                playerStatus[0] = !playerStatus[0];
                playerStatus[1] = !playerStatus[1];
            }
            if (playerStatus[0]) playerScore[0] += num;
            if (playerStatus[1]) playerScore[1] += num;
            System.out.println(playerScore[0]);
        }
        return playerScore[0] - playerScore[1];
    }
}