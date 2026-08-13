class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String time = timePoints.get(i);
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3, 5));
            times[i] = hours * 60 + minutes;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int difference = Math.abs(times[i] - times[j]);
                difference = Math.min(difference, 1440 - difference);
                min = Math.min(min, difference);
            }
        }
        return min;
    }
}