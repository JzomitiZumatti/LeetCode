class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        Set<Integer> friendsSet = new HashSet<>();
        for (int friend : friends) {
            friendsSet.add(friend);
        }
        int j = 0;
        for (int o : order) {
            if (friendsSet.contains(o)) {
                res[j] = o;
                j++;
            }
        }
        return res;
    }
}