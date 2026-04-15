class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) return 0;
        int prevIndex = (startIndex - 1 + words.length) % words.length;
        int nextIndex = (startIndex + 1) % words.length;
        int prevCounter = 0;
        int nextCounter = 0;
        int i = startIndex;
        int j = startIndex;
        boolean prevFind = false;
        boolean nextFind = false;
        while (prevIndex != startIndex) {
                prevCounter++;
                if (words[prevIndex].equals(target)) {
                    prevFind = true;
                    break;
                }
                i--;
                prevIndex = (i - 1 + words.length) % words.length;
        }

        while (nextIndex != startIndex) {
            nextCounter++;
            if (words[nextIndex].equals(target)) {
                nextFind = true;
                break;
            }
            j++;
            nextIndex = (j + 1) % words.length;
        }

        return !prevFind && !nextFind ? - 1 : !prevFind && nextFind  ? nextCounter :
                prevFind  && !nextFind ? prevCounter : Math.min(prevCounter, nextCounter);
    }
}