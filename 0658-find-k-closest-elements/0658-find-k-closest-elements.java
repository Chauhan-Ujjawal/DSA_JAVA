import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        // Step 1: Find the closest index to x using binary search
        int i = 0;
        while (i < n && arr[i] < x) {
            i++;
        }

        // Now i is the first element >= x or arr.length
        int left = i - 1;
        int right = i;

        // Step 2: Choose k closest elements
        while (k-- > 0) {
            if (left < 0) {
                list.add(arr[right++]);
            } else if (right >= n) {
                list.add(arr[left--]);
            } else {
                if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                    list.add(arr[left--]);
                } else {
                    list.add(arr[right++]);
                }
            }
        }

        // Step 3: Sort the result because problem usually expects sorted order
        Collections.sort(list);
        return list;
    }
}
