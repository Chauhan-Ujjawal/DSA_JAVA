class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList <Integer> result = new ArrayList <>();
        int i=0;
        int j=0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Found an intersection
                if (!result.contains(nums1[i])) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        int[] nums3 = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            nums3[k] = result.get(k);
        }
        return nums3;        
    }
}