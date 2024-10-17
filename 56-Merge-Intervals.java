class Solution {
    public int[][] merge(int[][] intervals) {
        //returning an empty 2d array when the input array is empty
        if (intervals.length == 0) return new int[0][];
         //creating an empty sub array for storing intervals 
        List<int[]> res = new ArrayList<>();        
        //sorting all intervals on the basis of first element of the subarray
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            //storing a specific sub-array from the 2D array intervals into a single-dimensional array named interval
            int[] interval = intervals[i];  

            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);  
                //extending subarray in case of overlapping
            } else {
                //in case the next pair is not merging with previuos pair adding the previous pair in arraylist and updating current pair 
                res.add(new int[]{start, end});    
                start = interval[0];               
                end = interval[1];
            }
        }

        res.add(new int[]{start, end});  // Add the last interval
        return res.toArray(new int[0][]);
    }
}
