class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nums1[0]);
        stringBuilder.append(nums2[0]);
        int min = Integer.parseInt(stringBuilder.toString());
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                stringBuilder.setLength(0);
                if (nums1[i] == nums2[j]) {
                    min = Math.min(min, nums1[i]);
                } else {
                    stringBuilder.append(nums1[i]);
                    stringBuilder.append(nums2[j]);
                    int tempStraight = Integer.parseInt(stringBuilder.toString());
                    int tempSReverse = Integer.parseInt(stringBuilder.reverse().toString());
                    min = Math.min(min, Math.min(tempStraight, tempSReverse));
                }
            }
        }
        return min;
    }
}