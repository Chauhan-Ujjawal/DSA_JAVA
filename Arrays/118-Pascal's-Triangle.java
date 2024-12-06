import java.util.ArrayList;
import java.util.List;

class Solution {
    // Define nCr method outside of the generate method
    public static int nCr(int n, int r) {
        int res = 1; // Initialize res to 1
        if (r > n - r) {
            r = n - r; // nCr(n, r) == nCr(n, n-r)
        }
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int col = 0; col <= row; col++) { // Loop to only add relevant numbers for that row
                int res2 = nCr(row, col); // Call nCr to get binomial coefficient
                list1.add(res2);
            }
            ans.add(list1); // Add the current row to the answer
        }
        return ans;
    }
}
