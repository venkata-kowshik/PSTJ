class Solution {
    public boolean halvesAreAlike(String s) {
        String ss = s.toLowerCase();
        int n = s.length();
        int mid = n / 2;
        int firsthalf = 0;
        int secondhalf = 0;
        for (int i = 0; i < mid; i++) {
            char ch = ss.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                firsthalf++;
            }
        }
        for (int i = mid; i < n; i++) {
            char ch = ss.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                secondhalf++;
            }
        }
        if (firsthalf == secondhalf)
            return true;
        else
            return false;
    }
}
