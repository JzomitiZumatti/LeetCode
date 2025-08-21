class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> numbVal = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                numbVal.put(nums1[i][j], numbVal.getOrDefault(nums1[i][j], 0) + nums1[i][j + 1]);
                break;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                numbVal.put(nums2[i][j], numbVal.getOrDefault(nums2[i][j], 0) + nums2[i][j + 1]);
                break;
            }
        }

        int[][] res = new int[numbVal.size()][2];

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : numbVal.entrySet()) {
            res[i][0] = entry.getKey();
            res[i][1] = entry.getValue();
            i++;
        }
        int columnIndexToSort = 0;
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[columnIndexToSort], row2[columnIndexToSort]);
            }
        });
        return res;
    }
}