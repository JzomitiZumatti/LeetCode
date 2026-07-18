class Solution {
    public int countTime(String time) {
        String[] hours = new String[24];
        for (int i = 0; i < 24; i++) {
            hours[i] = String.format("%02d", i);
        }
        String[] minutes = new String[60];
        for (int i = 0; i < 60; i++) {
            minutes[i] = String.format("%02d", i);
        }
        int ans = 0;
        for (String hour : hours) {
            for (String minute : minutes) {
                String temp = hour + ":" + minute;
                boolean valid = true;
                for (int k = 0; k < time.length(); k++) {
                    if (time.charAt(k) != '?' && time.charAt(k) != temp.charAt(k)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) ans++;
            }
        }
        return ans;
    }
}