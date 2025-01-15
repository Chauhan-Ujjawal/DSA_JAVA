class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            if (Character.isLetter(arr[low]) && Character.isLetter(arr[high])) {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            } else if (Character.isLetter(arr[low]) && !Character.isLetter(arr[high])) {
                high--;
            } else {
                low++;
            }
        }

        return new String(arr);
    }
}
