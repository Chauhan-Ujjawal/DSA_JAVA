class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=sentence.length();
        int[] arr = new int[27];
        Arrays.fill(arr, 0);
        for(int i=0;i<count;i++){
            int temp=sentence.charAt(i)-'a';
            arr[temp]++;
        }
        for(int j=0;j<26;j++){
            if(arr[j]==0) return false;
        }
        return true;
        
    }
}