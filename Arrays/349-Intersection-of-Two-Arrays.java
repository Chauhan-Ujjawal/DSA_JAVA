import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add elements from nums1 to the HashSet
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        // Check for intersections with nums2
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                resultSet.add(nums2[i]); // Add to result if found
            }
        }

        // Convert the resultSet to an int array
        int[] nums3 = new int[resultSet.size()]; // Create an array of the same size as resultSet
        Object[] tempArray = resultSet.toArray(); // Convert HashSet to Object array
        
        // Loop to fill the nums3 array using a traditional for loop
        for (int i = 0; i < nums3.length; i++) {
            nums3[i] = (int) tempArray[i]; // Cast each element to int and assign it
        }

        return nums3; // Return the filled array
    }
}
