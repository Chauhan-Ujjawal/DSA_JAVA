class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       int i=0; int j=0;
       int index1=0;int index2=0;
       while(i<word1.length && j<word2.length){
        if(word1[i].charAt(index1)!=word2[j].charAt(index2)) return false;
        index1++;
        index2++;
        if(index1==word1[i].length()){
            index1=0;
            i++;          
        }
        if(index2==word2[j].length()){
            index2=0;
            j++;          
        }
       }
       return i==word1.length && j==word2.length;
    }
}
