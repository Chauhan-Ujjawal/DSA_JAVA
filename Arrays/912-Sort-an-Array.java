class Solution {
    public int[] sortArray(int[] nums) {
        // Call mergeSort on the entire array
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    // Merge Sort method
    public void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;
            
            // Recursively sort the first half
            mergeSort(nums, left, mid);
            
            // Recursively sort the second half
            mergeSort(nums, mid + 1, right);
            
            // Merge the two halves
            merge(nums, left, mid, right);
        }
    }
    
    // Merge function that merges two sorted subarrays
    public void merge(int[] nums, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Temporary arrays to store left and right subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = nums[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = nums[mid + 1 + j];
        }
        
        // Initial indices of subarrays
        int i = 0, j = 0;
        int k = left;
        
        // Merge the arrays back into nums[]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[], if any
        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[], if any
        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
}
