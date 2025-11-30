class Solution {
    public boolean isPathCrossing(String path) {
        Set<int[]> visited = new HashSet<>();
        visited.add(new int[]{0, 0});
        int[] coord = new int[] {0, 0};
        for (int i = 0; i < path.length(); i++) {
            char p = path.charAt(i);
            switch (p) {
                case 'N' -> coord[1]++;
                case 'S' -> coord[1]--;
                case 'W' -> coord[0]--;
                case 'E' -> coord[0]++;
            }
            for (int[] array : visited) {
                if (Arrays.equals(array, coord)) {
                    return true;
                }
            }
            visited.add(new int[]{coord[0], coord[1]});

        }
        return false;
    }
}