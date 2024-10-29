class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        
        int totalPoisonedTime = 0;
        
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int interval = timeSeries[i + 1] - timeSeries[i];
            totalPoisonedTime += Math.min(interval, duration);
        }
        
        // Add the duration for the last attack
        totalPoisonedTime += duration;
        
        return totalPoisonedTime;
    }
}