class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        int j = 0;
        for (int spell : spells) {
            res[j] = binarySearch(spell, potions, success) != -1 ?
                    potions.length - binarySearch(spell, potions, success) : 0;
            j++;
        }
        return res;
    }

    private static int binarySearch(int n, int[] array, long success) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) array[mid] * n >= success) {
                resultIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return resultIndex;
    }
}