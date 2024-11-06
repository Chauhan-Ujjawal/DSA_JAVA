class Solution {
    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        
        int maxArea = 0;
        int[] heights = new int[matrix[0].length];
        
        // Convert each row to a histogram and calculate max area for each row
        for (int i = 0; i < matrix.length; i++) {
            // Update the histogram heights based on the current row
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            // Calculate the maximum area for the current histogram row
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        
        return maxArea;
        
    }
}