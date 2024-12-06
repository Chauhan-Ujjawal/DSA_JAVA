import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int i = 0, j = 0;

        // Sort both arrays to use two pointers technique
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list1.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert ArrayList to int[]
        int[] intArray = new int[list1.size()];
        for (int k = 0; k < list1.size(); k++) {
            intArray[k] = list1.get(k);
        }
        
        return intArray;
    }
}
