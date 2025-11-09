class Solution {
    public int countPoints(String rings) {
        int counter = 0;
        Set<Integer> red = new HashSet<>();
        Set<Integer> green = new HashSet<>();
        Set<Integer> blue = new HashSet<>();
        Set<Integer> rods = new HashSet<>();
        for (int i = 1; i < rings.length(); i += 2) {
            int rod = Integer.parseInt(String.valueOf(rings.charAt(i)));
            if (rings.charAt(i - 1) == 'R') red.add(rod);
            else if (rings.charAt(i - 1) == 'G') green.add(rod);
            else blue.add(rod);
            rods.add(rod);
        }
        List<Integer> r = new ArrayList<>(rods);
        for (Integer i : r) {
            if (red.contains(i) && green.contains(i) && blue.contains(i)) counter++;
        }
        return counter;
    }
}